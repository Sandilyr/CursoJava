package com.softtek.java.academy.jdbc.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.softtek.java.academy.jdbc.DataSourceDB;
import com.softtek.java.academy.jdbc.entity.User;

public class UserRepository {
	
	public User selectUsers(int user_id){
		
		User user = new User();
		Connection connection = DataSourceDB.getConnection();
		StringBuilder query = new StringBuilder();
		query.append("SELECT user_id, name, username, active ");
		query.append("FROM user ");
		query.append("WHERE user_id=?;");

		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		

	    try {

	    	preparedStatement = connection.prepareStatement(query.toString());
	    	preparedStatement.setInt(1, user_id);
	    	resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	        	user.setUser_id(resultSet.getInt(1));
	        	user.setName(resultSet.getString(2));
	        	user.setUsername(resultSet.getString(3));
	            user.setActive(resultSet.getString(4));    
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {

	            this.close(resultSet, preparedStatement, connection);
	        }

	        return user;
	    }
	
	
	 private void close(ResultSet resultSet,
		        PreparedStatement preparedStatement,
		        Connection connection) {

		        if (resultSet != null && preparedStatement != null
		            && connection != null) {

		            try {
		                if (!resultSet.isClosed()) {
		                    resultSet.close();
		                }

		                if (!preparedStatement.isClosed()) {
		                    preparedStatement.close();
		                }

		                if (!connection.isClosed()) {
		                    connection.close();
		                }
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		
	}
	
	
	

