import orm.config.Connector;

import java.sql.SQLException;
import java.util.Date;

public class main {
    public static void main(String[] args) throws SQLException {

        Connector.createConnection("root",
                "par0lata",
                "soft_uni");

        System.out.println(new Date());



    }
}
