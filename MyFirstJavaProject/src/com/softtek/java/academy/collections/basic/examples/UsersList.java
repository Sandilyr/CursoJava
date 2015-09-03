package com.softtek.java.academy.collections.basic.examples;

import java.util.ArrayList;
import java.util.List;


public class UsersList {
	
	public void compareList(List userList1, List userList2){
	//comparar listas
	
			for(int i=0; i<userList1.size(); i++){
				for(int j=0; j <userList2.size(); j++){
					if (!userList1.equals(userList2)){
						if (userList1.get(i).equals(userList2.get(j))) {
							System.out.println("Lo repetido es: " + userList1.get(i));
					}else{
						if (i!=j){
							if (userList1.get(i).equals(userList2.get(j))) {
								System.out.println("Lo repetido es: " + userList1.get(i));
							}
						}
					}
					
					
					}
				}
			}
	}
			

	public static void main(String[] args) {
		
		//crea lista 1
		List<User> userList1 = new ArrayList<User>();
		
		User usuario1 = new User();
		usuario1.setName("Sandily");
		usuario1.setLastName("Rivera");
		usuario1.setAddress("calle angulo 7");
		
		User usuario2 = new User();
		usuario2.setName("Juan");
		usuario2.setLastName("Rivera");
		usuario2.setAddress("calle angulo 15");

		User usuario3 = new User();
		usuario3.setName("Sandily");
		usuario3.setLastName("Valles");
		usuario3.setAddress("calle berlin 7");
		
		User usuario4 = new User();
		usuario4.setName("Pepe");
		usuario4.setLastName("Aguilar");
		usuario4.setAddress("calle blah blah");
		
		User usuario5 = new User();
		usuario5.setName("Pedro");
		usuario5.setLastName("Mendez");
		usuario5.setAddress("calle jupiter 350");
		
		User usuario6 = new User();
		usuario6.setName("Nombre generico");
		usuario6.setLastName("apellido generico");
		usuario6.setAddress("direccion equis");
		
		userList1.add(usuario1);
		userList1.add(usuario2);
		userList1.add(usuario3);
		userList1.add(usuario4);
		userList1.add(usuario5);
		userList1.add(usuario6);
	
		
		//crear lista 2
		List<User> userList2 = new ArrayList<User>();
		
		User user1 = new User();
		user1.setName("Sandily");
		user1.setLastName("Valles");
		user1.setAddress("calle berlin 7");
		
		User user2 = new User();
		user2.setName("Juan");
		user2.setLastName("Ramones");
		user2.setAddress("calle angulo 15");

		User user3 = new User();
		user3.setName("Mario");
		user3.setLastName("Valles");
		user3.setAddress("calle pulianas");
		
		userList2.add(user1);
		userList2.add(user2);
		userList2.add(user3);
		
		UsersList ul = new UsersList();
		ul.compareList(userList1, userList2);
		
		
		
	}
	
	
}
