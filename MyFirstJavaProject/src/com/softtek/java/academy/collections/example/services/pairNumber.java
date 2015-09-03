package com.softtek.java.academy.collections.example.services;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class pairNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();

		Comparator r = Collections.reverseOrder();
		
		Collections.sort(numbers, r);
		
		for (int i=0; i<30;i++){
			numbers.add(i+1);
		}

		for (int i=0; i<30;i++){
			if (numbers.get(i)%2 != 0){
				numbers.remove(i);
			}
		}

		
		Iterator li = numbers.iterator();
		while(li.hasNext()){
			System.out.println(li.next() + " ");
		}
		
		

	}

}
