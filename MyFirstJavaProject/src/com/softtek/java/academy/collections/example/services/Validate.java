package com.softtek.java.academy.collections.example.services;



import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Validate {

		   // generic method validate (validates every object of a class that implements pojoInterface)                     
		   public static <T extends pojoInterface> boolean validatePojo( T pojo )
		   {	
			   return (pojo.getName()==null) ? false : true;		
		    }
	
		   
		   //Just a method to fill a list of Users
		   public static LinkedList<User> fillLists(){
			   
			   LinkedList<User> list = new LinkedList<User>();
			   User user1 = new User();
			   User user2 = new User();
			   User user3 = new User();
			   User user4 = new User();
			
			   
			   user1.setName("Sofia");
			   user3.setName("Carla");
			   user4.setName("Elena");
			   
			   user1.setLastName("Mendez");
			   user2.setLastName("Ramirez");
			   user3.setLastName("Zamora");
			   user4.setLastName("Aguilar");
			   
			   user1.setCity("Mexicali");
			   user4.setCity("Tijuana");
			   
			   list.add(user1);
			   list.add(user2);
			   list.add(user3);
			   list.add(user4);
	
			   
			   return list;
			  
}
		   
		
		   // generic method validate (validates every LinkedList of objects of a class that implements pojoInterface)   
			public static <T extends pojoInterface> void validateListofPojos (LinkedList<T> list){
				
				 Iterator<T> li = list.iterator();
				   
				   System.out.println("Validation:");
				   while(li.hasNext()){
					   T user = li.next();
					   if (!validatePojo(user)){
						   System.out.println(user + " HAS NO NAME");
					   }else{
						   System.out.println(user + " is ok");
					   }
				   }
				   System.out.println("");
				
			}
		
		 

		   
		   public static void main( String args[] )
		    {
			   LinkedList<User> list = fillLists();	   
			   validateListofPojos(list);
			   
			   
			   // the natural order of User is by last name
			   Collections.sort(list);
			   Iterator<User> li2 = list.iterator();
			   System.out.println("Ordered list by last name: ");
			   while(li2.hasNext()){
					   System.out.println(li2.next());
			   }
			   System.out.println("");
					   
			   // order by name
			   Comparator<User> r = Collections.reverseOrder();	   
			   Collections.sort(list, r);	
			   Iterator<User> li3 = list.iterator();
			   System.out.println("Ordered list by last name in reverse: ");
			   while(li3.hasNext()){
					   System.out.println(li3.next());
			   }
					   
			   
			  
		    
		    }
		   
		   
	
}
