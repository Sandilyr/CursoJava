package com.softtek.java.academy.jdbc.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

import com.softtek.java.academy.jdbc.DataSourceDB;
import com.softtek.java.academy.jdbc.entity.User;

public class UserRepository {
	
	public User selectUser(int user_id){
		
		User user = new User();
		Connection connection = DataSourceDB.getConnection();
		final StringBuilder query = new StringBuilder();
		query.append("SELECT user_id, username, password, name, user_role_id, active ");
		query.append("FROM user ");
		query.append("WHERE user_id=?");

		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		

	    try {

	    	preparedStatement = connection.prepareStatement(query.toString());
	    	preparedStatement.setInt(1, user_id);
	    	resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	        	user.setUserId(resultSet.getInt(1));
	        	user.setUsername(resultSet.getString(2));
	        	user.setPassword(resultSet.getString(3));
	        	user.setName(resultSet.getString(4));
	        	user.setUserRoleId(resultSet.getString(5));
	            user.setActive(resultSet.getString(6));    
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {

	            this.close(resultSet, preparedStatement, connection);
	        }

	        return user;
	    }
	
	
	  public List<User> allUsersById() {

	        List<User> users = new ArrayList<User>();
	        User user = new User();
	        Connection connection = DataSourceDB.getConnection();
			final StringBuilder query = new StringBuilder();
			query.append("SELECT user_id, username, password, name, user_role_id, active ");
			query.append("FROM user ");
			//query.append("WHERE active='s'");
			//query.append("ORDER by user_id DESC");
			

			PreparedStatement preparedStatement=null;
			ResultSet resultSet=null;
			
	        try {
	        	
	        	try {

	        	preparedStatement = connection.prepareStatement(query.toString());
		    	resultSet = preparedStatement.executeQuery();}
	        	
	        	catch(SQLSyntaxErrorException e){
	        		System.out.println("syntax error");
	        	}
	        	
	            while (resultSet.next()) {

	            	user.setUserId(resultSet.getInt(1));
		        	user.setUsername(resultSet.getString(2));
		        	user.setPassword(resultSet.getString(3));
		        	user.setName(resultSet.getString(4));
		        	user.setUserRoleId(resultSet.getString(5));
		            user.setActive(resultSet.getString(6));  
		            users.add(user);
	            }
	        	

	        } catch (SQLException e) {
	        	System.out.println(e.getMessage());
	        	System.out.println("Your query is wrong");
	        	
	            
	        } finally {

	            this.close(resultSet, preparedStatement, connection);
	        }

	        return users;
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
	
	
	

