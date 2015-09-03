package com.softtek.java.academy.collections.basic.examples;

import java.util.ArrayList;
import java.util.List;

public class NumberList {


	
	public static void main(String[] args) {
		List<Integer> nList = new ArrayList<Integer>();
		
		//for (int i=0; 2*i+1<30; i++){
		//	nList.add(2*i+1);		
		//}
		//System.out.println("\t"+ nList);
		
		for (int i=0; i<30;i++){
			if (i%2!=0){
				nList.add(i);
			}
		}
		System.out.println("\t"+ nList);
						
	}

}
