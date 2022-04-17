/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCConnection {
  public static Connection getJDBCConnection() {
         final String url = "jdbc:sqlserver://CAOTUANKIET\\SQLEXPRESS:1433;databaseName = NGUOIDUNG";
        final String userName = "sa";
        final String password = "123456789";
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
