package com.softtek.java.academy.jdbc.finalproject.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.softtek.java.academy.jdbc.DataSourceDB;
import com.softtek.java.academy.jdbc.finalproject.entity.Animal;

public class AnimalRepository {

	/**
	 * Connects with the DataBase and retrieve all the information from the table animals.
	 * Returns a list of Animals with all the retrieved information.
	 * @return the list of Animals
	 */
	public List<Animal> allAnimals() {

        final List<Animal> animals = new ArrayList<Animal>();
        final Connection connection = DataSourceDB.getConnection();
		final StringBuilder query = new StringBuilder();
		query.append("SELECT animal_name, animal_class, animal_family, animal_color, animal_size ");
		query.append("FROM animals ");
	
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		
        try {
        	
 

        	preparedStatement = connection.prepareStatement(query.toString());
	    	resultSet = preparedStatement.executeQuery();
      
            while (resultSet.next()) {
            	final Animal animal = new Animal();
            	animal.setName(resultSet.getString(1));
            	animal.setAnimalClass(resultSet.getString(2));
	        	animal.setFamily(resultSet.getString(3));
	        	animal.setColor(resultSet.getString(4));
	        	animal.setSize(resultSet.getString(5));
	            animals.add(animal);
            }
        	

        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        	
        } finally {

            this.close(resultSet, preparedStatement, connection);
        }

        return animals;
    }


	/**
	 * Close the Connection to data base as well the ResultSet and PreparedStatement
	 * @param resultSet  A ResultSet you want to close
	 * @param preparedStatement  A PreparedStatement you want to close
	 * @param connection  A Connection to the data base you want to close
	 */

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

