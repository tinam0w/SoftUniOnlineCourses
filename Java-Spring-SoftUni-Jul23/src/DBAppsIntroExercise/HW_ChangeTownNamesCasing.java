package DBAppsIntroExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HW_ChangeTownNamesCasing {
    private static final String COUNT_ALL_TOWNS_QUERY =
            "select count(*) as count_towns from towns where country = ?;";
    private static final String UPDATE_TOWN_NAME_BY_ID =
            "update towns set name = UPPER(name) where country = ?;";
    private static final String GET_TOWN_BY_ID =
            "select name from towns where id = ?;";

    public static void main(String[] args) throws SQLException {
        final Connection connection = Utils.getSqlConnection();

        final String countryName = new Scanner(System.in).nextLine();

        final PreparedStatement countTownsStatement =
                connection.prepareStatement(COUNT_ALL_TOWNS_QUERY);
        countTownsStatement.setString(1, countryName);

        final ResultSet resultSet = countTownsStatement.executeQuery();
        resultSet.next();

        final int countTowns = resultSet.getInt("count_towns");

        if (countTowns == 0) {
            System.out.println("No town names were affected.");
            connection.close();
            return;
        } else {
            System.out.println(countTowns + " town names were affected.");
            System.out.print("[");

            final PreparedStatement updateTownNameStatement = connection.prepareStatement(UPDATE_TOWN_NAME_BY_ID);
            final PreparedStatement getTownNameStatement = connection.prepareStatement(GET_TOWN_BY_ID);

            for (int i = 1; i <= countTowns; i++) {
                updateTownNameStatement.setString(1, countryName);
                updateTownNameStatement.executeUpdate();

                getTownNameStatement.setInt(1, i);
                ResultSet resultSetTownName = getTownNameStatement.executeQuery();

                resultSetTownName.next();

                if (i != countTowns) {
                    System.out.print(resultSetTownName.getString("name") + ", ");
                } else {
                    System.out.print(resultSetTownName.getString("name") + "]");
                }

            }
        }
    }
}
