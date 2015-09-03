package com.softtek.java.academy.exercises.interfaces;
import java.util.Comparator;

public class StudentAverageComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		
		return o1.getAverage() - o2.getAverage();
	}
	
}

