package com.softtek.java.academy.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceDB {

	    private static BasicDataSource dataSource;

	    static {
	        //Data sources are provided and configured normally in Application servers
	    	dataSource = new BasicDataSource();
	    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    	dataSource.setUsername("srivera");
	    	dataSource.setPassword("srivera");
	    	dataSource.setUrl("jdbc:mysql://stkend11132:3306/sriveraDB");
	    }



	    public static Connection getConnection() {

	        Connection connection = null;
	        
	        try {
	            connection = dataSource.getConnection();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	    


	}
	