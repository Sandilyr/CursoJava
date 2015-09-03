package com.softtek.java.academy.collections.example.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class algorithmsExample {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));
		
		Comparator r = Collections.reverseOrder();
		
		Collections.sort(ll, r);
		
		Iterator li = ll.iterator();
		System.out.println("List sorted in reverse: ");
		while(li.hasNext()){
			System.out.println(li.next() + " ");
		}
		System.out.println();
		Collections.shuffle(ll);
		
		li=ll.iterator();
		System.out.println("List shuffled: ");
		while(li.hasNext()){
			System.out.println(li.next() + " ");
		}
		System.out.println("Minimun " + Collections.min(ll));
		System.out.println("Maximun " + Collections.max(ll));

	}

}
