package com.softtek.java.academy.exercises.interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class MainStudentComparator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Student s1 = new Student("sandy",1,100);
		Student s2 = new Student("diego",2,40);
		Student s3 = new Student("alejandra",3,98);
		Student s4 = new Student("eduardo",4,95);
		Student s5 = new Student("sandy",5,70);
		Student s6 = new Student("sandy",6,93);
		Student s7 = new Student("sandy",7,10);
		Student s8 = new Student("sandy",8,86);
		Student s9 = new Student("sandy",10,50);
		Student s10 = new Student("sandy",9,90);
		
		Student[] s = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
		
		System.out.println("Before sort:");
		for (Student stu : s) {
			System.out.println(stu);
		}
		
		System.out.println("do you want to sort by average (type 1), by name (type 2) or by ID (type 3)?");
		
		
		
		switch(scanner.nextInt()){
		case 1: Arrays.sort(s, new StudentAverageComparator());
				break;
		case 2: Arrays.sort(s, new StudentNameComparator());
				break;
		case 3: Arrays.sort(s, new StudentIdComparator());
				break;
		default: System.out.println("NO es valido");
				break;
				
		}
		
		System.out.println("After sort:");
		for (Student stu : s) {
			System.out.println(stu);
		}

	}

	

}
