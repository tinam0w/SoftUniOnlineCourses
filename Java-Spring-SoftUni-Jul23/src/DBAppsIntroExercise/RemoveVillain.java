package DBAppsIntroExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RemoveVillain {
    private static final String GET_VILLAIN_BY_ID = "select name from villains where id = ?;";
    private static final String COUNT_MINIONS_BY_VILLAIN_ID = "select count(*) as m_count from minions_villains where villain_id = ?;";
    private static final String DELETE_MINIONS_BY_VILLAIN_ID = "delete from minions_villains where villain_id = ?;";
    private static final String DELETE_VILLAIN_BY_ID = "delete from villains where id = ?;";
    private static final String PRINT_MINIONS_DELETED = "%d minions released\n";
    private static final String PRINT_VILLAIN_DELETED = "%s was deleted\n";
    private static final String PRINT_NO_SUCH_VILLAIN = "No such villain was found\n";

    public static void main(String[] args) throws SQLException {
        final Connection sqlConnection = Utils.getSqlConnection();
        final int villainId = new Scanner(System.in).nextInt();

        final PreparedStatement statement = sqlConnection.prepareStatement(GET_VILLAIN_BY_ID);
        statement.setInt(1, villainId);

        final ResultSet villainResultSet = statement.executeQuery();
        if (!villainResultSet.next()) {
            System.out.println(PRINT_NO_SUCH_VILLAIN);
            sqlConnection.close();
            return;
        }

        final String villainName = villainResultSet.getString("name");

        final PreparedStatement getCountMinionsStatement = sqlConnection.prepareStatement(COUNT_MINIONS_BY_VILLAIN_ID);
        getCountMinionsStatement.setInt(1, villainId);
        final ResultSet resultSetMinionsCount = getCountMinionsStatement.executeQuery();
        
        resultSetMinionsCount.next();
        int minionsCount = resultSetMinionsCount.getInt(1);
        
        sqlConnection.setAutoCommit(false);

        try {
            final PreparedStatement reselaseMinionsStatement = sqlConnection.prepareStatement(DELETE_MINIONS_BY_VILLAIN_ID);
            reselaseMinionsStatement.setInt(1, villainId);
            reselaseMinionsStatement.executeUpdate();

            final PreparedStatement deleteVillainStatement = sqlConnection.prepareStatement(DELETE_VILLAIN_BY_ID);
            deleteVillainStatement.setInt(1, villainId);
            deleteVillainStatement.executeUpdate();

            sqlConnection.commit();

            System.out.printf(PRINT_VILLAIN_DELETED, villainName);
            System.out.printf(PRINT_MINIONS_DELETED, minionsCount);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

            sqlConnection.rollback();
        }

        sqlConnection.close();
    }
}
