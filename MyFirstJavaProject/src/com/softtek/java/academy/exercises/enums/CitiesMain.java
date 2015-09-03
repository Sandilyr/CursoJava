package com.softtek.java.academy.exercises.enums;

import java.util.Scanner;

public class CitiesMain {

	void printCity(CitiesEnum c ){
		
		switch(c){
			case TIJUANA: 
			case MEXICALI:
			case ENSENADA:
			case TECATE:
			case ROSARITO:
				System.out.println("You are in Baja California");
				break;
			case GUADALAJARA:
			case ZAPOPAN:
				System.out.println("You are in Jalisco");
				break;
			case ACAPULCO:
				System.out.println("You are in Guerrero");
			
		}
	}
	
	public static void main(String[] args) {
		
		CitiesMain cm = new CitiesMain();
		Scanner s = new Scanner(System.in);
		
		System.out.println("city (type ENSENADA,MEXICALI,GUADALAJARA or ACAPULCO): ");
		CitiesEnum city;
		city = CitiesEnum.valueOf(s.next().toUpperCase());		
		cm.printCity(city);
		
	}

}
