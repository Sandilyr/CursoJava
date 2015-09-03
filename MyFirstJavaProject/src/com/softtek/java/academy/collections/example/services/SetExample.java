package com.softtek.java.academy.collections.example.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		User user1 = new User();
		User user3 = new User();
		User user4 = new User();
		
		user1.setName("Sofia");
		user3.setName("Elena");
		user4.setName("Elena");
		   
		user1.setLastName("Mendez");
		user3.setLastName("Zamora");
		user4.setLastName("Zamora");
		
		User user2 = user1;
		
	
		Set<User> set = new HashSet<User>();
		//set.add(user1);
		//set.add(user2);
		set.add(user3);
		set.add(user4);
		
		//System.out.println(set.hashCode());
		//System.out.println(user1.hashCode());
		//System.out.println(user2.hashCode());
		//System.out.println(user3.hashCode());
		//System.out.println(user4.hashCode());
		
		
		
		String perro1= "perro";
		String perro2= "perr";
		String perro3= "per";
		String perro4= "pe";
		
		Set<String> set2 = new HashSet<String>();
		set2.add(perro1);
		set2.add(perro2);
		set2.add(perro3);
		set2.add(perro4);
		//System.out.println(set2.hashCode());
		
		List<String> list = new ArrayList<String>();
		list.add(perro1);
		list.add(perro2);
		list.add(perro3);
		list.add(perro4);
		//System.out.println(list.hashCode());
		
		//System.out.println(perro1.hashCode());
		//System.out.println(perro2.hashCode());
		//System.out.println(perro3.hashCode());
		//System.out.println(perro4.hashCode());
		
		Set<String> set3 = new HashSet<String>();
		set3.add("perro");
		set3.add("perr");
		set3.add("per");
		set3.add("pe");
		
		System.out.println(set2.equals(set3));
		
		Map map = new HashMap();
		map.put(set, list);
		System.out.
		
		
		println(map);
		

		

	}

}
