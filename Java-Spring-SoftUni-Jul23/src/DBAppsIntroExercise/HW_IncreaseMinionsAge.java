package DBAppsIntroExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class HW_IncreaseMinionsAge {
    private static final String INCREASE_AGE_BY_ID =
            "update minions set age = age + 1 where id = ?;";
    private static final String LOWER_NAME_BY_ID =
            "update minions set name = LOWER(name) where id = ?;";
    private static final String SELECT_ALL_MINIONS_QUERY =
            "select * from minions;";
    private static final String PRINT_FORMAT = "%s %d\n";
    public static void main(String[] args) throws SQLException {
        final Connection connection = Utils.getSqlConnection();

        Scanner sc = new Scanner(System.in);
        final int[] minionIdsArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < minionIdsArr.length; i++) {
            updateMinionById(connection, minionIdsArr[i], LOWER_NAME_BY_ID);

            updateMinionById(connection, minionIdsArr[i], INCREASE_AGE_BY_ID);
        }

        final PreparedStatement statementAllMinions = connection.prepareStatement(SELECT_ALL_MINIONS_QUERY);
        final ResultSet resultSetAllMinions = statementAllMinions.executeQuery();

        while (resultSetAllMinions.next()){
            final String nameOfMinion = resultSetAllMinions.getString("name");
            final int ageOfMinion = resultSetAllMinions.getInt("age");

            System.out.printf(PRINT_FORMAT, nameOfMinion, ageOfMinion);
        }

    }

    private static void updateMinionById(Connection connection, int id, String query) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        statement.executeUpdate();
    }
}
