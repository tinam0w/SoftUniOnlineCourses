package DBAppsIntroExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintAllMinionNames {
    private static final String GET_ALL_MINIONS_QUERY = "select name from minions;";

    public static void main(String[] args) throws SQLException {
        final Connection connection = Utils.getSqlConnection();

        final PreparedStatement statement =
                connection.prepareStatement(
                        GET_ALL_MINIONS_QUERY,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
        final ResultSet resultSet = statement.executeQuery();

        int minionsCount = 0;
        while (resultSet.next()) minionsCount++;
        resultSet.beforeFirst();

        int firstIndex = 1;
        int lastIndex = minionsCount;

        for (int i = 1; i < minionsCount + 1; i++) {

            if (i % 2 == 0){
                resultSet.absolute(firstIndex);
                firstIndex++;
            } else {
                resultSet.absolute(lastIndex);
                lastIndex--;
            }

            System.out.println(resultSet.getString("name"));
            resultSet.next();
        }

    }
}
