package com.softtek.java.academy.exercises.main;
import java.util.Scanner;

import com.softtek.java.academy.exercises.Person;


public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person();

		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce your name:");
		person.setName(s.next());
		System.out.println("Introduce your year of birth: ");
		person.setYearOfBirth(s.nextInt());
		System.out.println("Introduce your address: ");
		person.setAddress(s.next());
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddress());

	}

}

