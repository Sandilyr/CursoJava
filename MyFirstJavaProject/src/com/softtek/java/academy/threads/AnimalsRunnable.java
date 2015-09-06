package com.softtek.java.academy.threads;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;




import com.softtek.java.academy.jdbc.finalproject.entity.Animal;
import com.softtek.java.academy.jdbc.finalproject.service.AnimalService;

public class AnimalsRunnable implements Runnable {


	
	
	 

	@Override
	public void run() {
		
		Map<String, List<Animal>> animalMap = AnimalService.createMap();
		
		for (Entry<String, List<Animal>> entry : animalMap.entrySet()) {
		    
			System.out.println("Animal Class = " + entry.getKey());
		    
		    for (int i=0; i<entry.getValue().size();i++){
		    	System.out.println(entry.getValue().get(i).getName());
		    	
		    	try {
		    		 Thread.sleep(1000);
		         }	 catch (InterruptedException e) {
		             	e.printStackTrace();
		         }
		    }
		    System.out.println(" ");
		}
		
		
		
	}
	
	
	

}
