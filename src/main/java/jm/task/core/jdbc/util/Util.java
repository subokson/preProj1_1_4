package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/newdatabase?useSSL=true&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Соединение: установлено");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
            System.err.println("Соединение: не установлено");
        }
        return connection;
    }
}

