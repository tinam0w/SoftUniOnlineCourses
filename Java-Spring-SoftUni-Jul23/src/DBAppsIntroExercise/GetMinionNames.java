package DBAppsIntroExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetMinionNames {
    private static final String GET_MINION_NAMES_BY_VILLAIN_ID = "select m.name, m.age " +
            "from minions as m " +
            "    join minions_villains mv on m.id = mv.minion_id " +
            "where mv.villain_id = ?;";
    private static final String GET_VILLAIN_NAME_BY_ID = "select name from villains where id = ?;";
    private static final String PRINT_FORMAT = "%d. %s %d\n";
    private static final String PRINT_NO_VILLAIN = "No villain with ID %d exists in the database.\n";

    public static void main(String[] args) throws SQLException {
        final Connection connection = Utils.getSqlConnection();

        final int villainId = new Scanner(System.in).nextInt();

        final PreparedStatement statementForVillain = connection.prepareStatement(GET_VILLAIN_NAME_BY_ID);
        statementForVillain.setInt(1, villainId);

        final ResultSet villainResultSet = statementForVillain.executeQuery();

        if (!villainResultSet.next()) {
            System.out.printf(PRINT_NO_VILLAIN, villainId);

            connection.close();
            return;
        }

        System.out.println("Villain: " + villainResultSet.getString("name"));

        final PreparedStatement statementForMinions = connection.prepareStatement(GET_MINION_NAMES_BY_VILLAIN_ID);
        statementForMinions.setInt(1, villainId);

        final ResultSet resultSet = statementForMinions.executeQuery();

        for (int i = 1; resultSet.next(); i++) {
            String minionName = resultSet.getString("name");
            int minionAge = resultSet.getInt("age");

            System.out.printf(PRINT_FORMAT, i, minionName, minionAge);
        }

        connection.close();
    }
}
