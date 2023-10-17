package DBAppsIntroLab;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class DiabloDemo {

    private static final String SELECT_USER_GAMES_COUNT_BY_USERNAME =
            "select first_name, last_name, count(ug.game_id) " +
            "from users as u " +
            "join users_games as ug on ug.user_id = u.id " +
            "where user_name = ? " +
            "group by first_name, last_name";

    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();

        String username = readUsername();

        PreparedStatement statement = connection.prepareStatement(SELECT_USER_GAMES_COUNT_BY_USERNAME);
        statement.setString(1, username);

        ResultSet result = statement.executeQuery();
        boolean hasRow = result.next();

        if (hasRow){
            System.out.println("User: " + username);
            System.out.printf("%s %s has played %d games%n",
                    result.getString(1),
                    result.getString(2),
                    result.getInt(3));
        } else {
            System.out.println("No such user exists");
        }

    }

    private static String readUsername() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        return username;
    }

    private static Connection getConnection() throws SQLException {
        Properties userPass = new Properties();
        userPass.setProperty("user", "root");
        userPass.setProperty("password", "par0lata");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/diablo",
                userPass);
        return connection;
    }
}
