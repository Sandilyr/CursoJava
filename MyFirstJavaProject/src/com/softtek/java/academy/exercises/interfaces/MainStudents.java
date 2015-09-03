package com.softtek.java.academy.exercises.interfaces;

import java.util.Scanner;

public class MainStudents {

	
	public static void main(String[] args) {
		
		Student[][] students = new Student[1][]; 
		Scanner s = new Scanner(System.in);
		int i = 0;
		do {
		////
		System.out.println("Name: ");
		String name = s.next(); 
		System.out.println("ID: ");
		int id = s.nextInt();
		System.out.println("Average : ");
		int average = s.nextInt();
		students[0][i] = new Student(name, id, average);
		System.out.println("Do you want to add another student? (1 for yes)");
		i++;
		}
		while(s.nextInt() == 1);
		
		
	}

}
