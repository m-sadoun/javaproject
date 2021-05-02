package jdbc;

import properties.ReadPropertiesFileClass;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToSql {
    public static Connection connectTosql() throws IOException, SQLException, ClassNotFoundException {

        String username = ReadPropertiesFileClass.readPropertiesFile("src/jdbc/jdbcconexion.properties", "username");
        String password = ReadPropertiesFileClass.readPropertiesFile("src/jdbc/jdbcconexion.properties", "password");
        String dbname = ReadPropertiesFileClass.readPropertiesFile("src/jdbc/jdbcconexion.properties", "dbname");
        String url = "jdbc:mysql://localhost:3306/" + dbname;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        return con;


    }
    public static void clearConection(Statement stat, Connection con) throws SQLException {
        if (stat!=null) {
            stat.close();
        }
        if(con!=null) {
            con.close();
        }

    }


}
