package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectionUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVERCLASSNAME = "com.mysql.jdbc.Driver";

    static {
        try {
            Class.forName(DRIVERCLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("驱动加载失败",e);
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("连接数据库失败",e);
        }
        return conn;
    }
}
