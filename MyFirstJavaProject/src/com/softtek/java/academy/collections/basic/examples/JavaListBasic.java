package com.softtek.java.academy.collections.basic.examples;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class JavaListBasic {


	
	public static void main(String[] args) {
		final List<String> nameList = new ArrayList<String>();
		nameList.add("Zara");
		nameList.add("Mahnaz");
		nameList.add("Ayan");
		System.out.println("ArrayList Elements");
		System.out.println("\t"+ nameList);
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("Zara");
		linkedList.add("Mahnaz");
		linkedList.add("Ayan");
		System.out.println("LinkedList Elements");
		System.out.println("\t"+ linkedList);

	}

}
