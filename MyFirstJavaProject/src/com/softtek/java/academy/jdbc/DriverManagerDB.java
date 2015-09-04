package com.softtek.java.academy.jdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DriverManagerDB {



	    static {

	        try {

	            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	    }


	    public static Connection getConnection() {

	        Connection connection = null;
	        try {

	            connection =
	                DriverManager.getConnection(
	                    "jdbc:mysql://stkend11132:3306/sriveraDB", "srivera", "srivera");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return connection;
	    }

	}
	

