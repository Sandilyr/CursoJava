package com.softtek.java.academy.jdbc.finalproject.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.softtek.java.academy.jdbc.finalproject.entity.Animal;
import com.softtek.java.academy.jdbc.finalproject.repository.AnimalRepository;


public class AnimalService {
	
	
	public static List<Animal> sublistAnimalsByClass(List<Animal> from, String animalClass){
		
		Iterator<Animal> it = from.iterator();
		List<Animal> result = new ArrayList<Animal>();
		while (it.hasNext()) {
			Animal animal = it.next();
			if (animal.getAnimalClass().equalsIgnoreCase(animalClass)){
				result.add(animal);
			}
		}
		
		return result;
		
	}
	
	public static void validateMap(Map<String, List<Animal>> animalMap, String key){
		
		 Iterator<Animal> it = animalMap.get(key).iterator();
		   
		 System.out.println("Validation:");
		 while(it.hasNext()){
			 Animal animal = it.next();
			   if (animal.getAnimalClass().equalsIgnoreCase(key)){
				   System.out.println(animal + "is correct");
			   }else{
				   System.out.println(animal + "doesn't belong to that animal class");
			   }
		   }
		   System.out.println("");
		
		
	}

	public static void main(String[] args) {
		
		final AnimalRepository animalRepository = new AnimalRepository();
		final List<Animal> animals = animalRepository.allAnimals();
		final Map<String, List<Animal>> animalMap = new HashMap<String, List<Animal>>();
	    	
		List<Animal> mammals = sublistAnimalsByClass(animals, "mammals");
		List<Animal> reptiles = sublistAnimalsByClass(animals, "reptiles");
		List<Animal> birds = sublistAnimalsByClass(animals, "birds");
		List<Animal> fish = sublistAnimalsByClass(animals, "fish");
		List<Animal> amphibians = sublistAnimalsByClass(animals, "amphibians");
		List<Animal> insects = sublistAnimalsByClass(animals, "insects");
		List<Animal> arachnids = sublistAnimalsByClass(animals, "arachnids");
		
		animalMap.put("Mammals", mammals);
		animalMap.put("Reptiles", reptiles);
		animalMap.put("Birds", birds);
		animalMap.put("Amphibians", amphibians);
		animalMap.put("Fish", fish);
		animalMap.put("Insects", insects);
		animalMap.put("Arachnids", arachnids);
	
		validateMap(animalMap, "Mammals");
		validateMap(animalMap, "Reptiles");
		validateMap(animalMap, "Birds");
		validateMap(animalMap, "Amphibians");
		validateMap(animalMap, "Fish");
		validateMap(animalMap, "Insects");
		validateMap(animalMap, "Arachnids");
		
	
}
}
