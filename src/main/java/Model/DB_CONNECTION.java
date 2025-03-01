
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_CONNECTION {

    public Connection Con;
    public Statement Stmt;
    public PreparedStatement Pstmt;
    public ResultSet Rst;

    public DB_CONNECTION() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String ConDb = "jdbc:mysql://localhost:3306/Hardware";
            String ConUsername = "root";
            String ConPassword = "";
            Con = DriverManager.getConnection(ConDb, ConUsername, ConPassword);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
