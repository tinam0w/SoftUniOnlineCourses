package DBAppsIntroExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// NOT WORKING PROCEDURE !!!!!!!!!!!!!!!!!!!!!!!!!
public class HW_IncreaseAgeStoredProcedure {
    private static final String PROCEDURE_QUERY =
            "delimiter // " +
                    "create procedure usp_get_older(?) " +
                    "begin " +
                    "    update minions " +
                    "    set minions.age = minions.age + 1 " +
                    "    where minions.id = ?; " +
                    "end// " +
                    "delimiter ; ";
    private static final String CALL_PROCEDURE =
            "call usp_get_older(?);";
    private static final String GET_MINION_BY_ID =
            "select * from minions where id = ?;";
    private static final String PRINT_FORMAT = "%s %d\n";

    public static void main(String[] args) throws SQLException {
        Connection connection = Utils.getSqlConnection();

        final int id = new Scanner(System.in).nextInt();

        PreparedStatement procedureStatement = connection.prepareStatement(PROCEDURE_QUERY);
        procedureStatement.setInt(1, id);
        procedureStatement.setInt(2, id);

        procedureStatement.execute();

        PreparedStatement callProcedureStatement = connection.prepareStatement(CALL_PROCEDURE);
        callProcedureStatement.setInt(1, id);

        callProcedureStatement.execute();

        PreparedStatement statementGetMinion = connection.prepareStatement(GET_MINION_BY_ID);
        statementGetMinion.setInt(1, id);

        ResultSet resultSet = statementGetMinion.executeQuery();

        System.out.printf(PRINT_FORMAT,
                resultSet.getString("name"),
                resultSet.getInt("age"));
    }
}
