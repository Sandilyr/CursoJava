package com.softtek.java.academy.jdbc.finalproject.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.softtek.java.academy.jdbc.finalproject.entity.Animal;
import com.softtek.java.academy.jdbc.finalproject.repository.AnimalRepository;


public class AnimalService {
	
	/**
	 * Receives a list of Animals and makes a sublist of Animals with all the animals 
	 * that are from a certain Animal Class
	 * @param from  The list you want to check
	 * @param animalClass  Animal Class you want to search
	 * @return  the list of animals of class animalClass
	 */
	
	public static List<Animal> sublistAnimalsByClass(List<Animal> list, String animalClass){
		
		Iterator<Animal> it = list.iterator();
		List<Animal> result = new ArrayList<Animal>();
		while (it.hasNext()) {
			Animal animal = it.next();
			if (animal.getAnimalClass().equalsIgnoreCase(animalClass)){
				result.add(animal);
			}
		}
		
		return result;
		
	}
	
	
	
	/**
	 *  Validates that the Map of List of Animals has the correct animals according to a the animal class(key)
	 * @param animalMap  The map you want to check
	 * @param key  The key you are going to validate
	 */
	
	public static void validateMap(Map<String, List<Animal>> animalMap, String key){
		
		 Iterator<Animal> it = animalMap.get(key).iterator();
		   
		 System.out.println("Validation:");
		 while(it.hasNext()){
			 Animal animal = it.next();
			   if (animal.getAnimalClass().equalsIgnoreCase(key)){
				   System.out.println(animal + " is correct");
			   }else{
				   System.out.println(animal + " doesn't belong to this animal class");
			   }
		   }
		   System.out.println("");
		
		
	}
	
	
	public static Map<String, List<Animal>> createMap(){
		final AnimalRepository animalRepository = new AnimalRepository();
		final List<Animal> animals = animalRepository.allAnimals();
		final Map<String, List<Animal>> animalMap = new HashMap<String, List<Animal>>();
		final List<Animal> mammals = sublistAnimalsByClass(animals, "mammals");
		final List<Animal> reptiles = sublistAnimalsByClass(animals, "reptiles");
		final List<Animal> birds = sublistAnimalsByClass(animals, "birds");
		final List<Animal> fish = sublistAnimalsByClass(animals, "fish");
		final List<Animal> amphibians = sublistAnimalsByClass(animals, "amphibians");
		final List<Animal> insects = sublistAnimalsByClass(animals, "insects");
		final List<Animal> arachnids = sublistAnimalsByClass(animals, "arachnids");
		
		
		animalMap.put("Mammals", mammals);
		animalMap.put("Reptiles", reptiles);
		animalMap.put("Birds", birds);
		animalMap.put("Amphibians", amphibians);
		animalMap.put("Fish", fish);
		animalMap.put("Insects", insects);
		animalMap.put("Arachnids", arachnids);
		return animalMap;
		
		
	}
	
	
	

	public static void main(String[] args) {
		
	
		final Map<String, List<Animal>> animalMap = createMap();
		
	    
		
		//PRUEBAAA
		Animal animalito = new Animal();
		animalito.setAnimalClass("fish");
		animalito.setColor("gold");
		animalito.setFamily("familia algo");
		animalito.setName("nemo");
		animalito.setSize("peque");
		animalMap.get("Birds").add(animalito);
		
	
		/**
		 * Validates all the map
		 */
		for (String key : animalMap.keySet()) {
			System.out.println(key);
			validateMap(animalMap, key);
			}
		
		
	
		/**
		 * Prints the Animal classes with the corresponding animals
		 */
		System.out.println("Animal Classes");
		System.out.println("");
		for (Entry<String, List<Animal>> entry : animalMap.entrySet()) {
		    System.out.println("Animal Class = " + entry.getKey());
		    for (int i=0; i<entry.getValue().size();i++){
		    	System.out.println(entry.getValue().get(i).getName());
		    }
		    System.out.println(" ");
		}
	
	
}
}

