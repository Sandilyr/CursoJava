package com.softtek.java.academy.collections.basic.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, List<String>> listsMap = new HashMap<String, List<String>>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		
		list2.add("mundo");
		list2.add("me");
		list2.add("me lele");
		list2.add("la panza");
		
		list3.add("kdjnsk");
		list3.add("wooosdfjs");
		list3.add("wuuu");
		
		listsMap.put("Cosa 1", list1);
		listsMap.put("Cosa 2", list2);
		listsMap.put("Cosa 3", list3);
		
		//System.out.println();
		//System.out.println(" Map Elements");
		//System.out.print("\t" + listsMap);

		// lista vacia o no?
		
		if (listsMap.get("Cosa 1").isEmpty()){
			System.out.println("the list is empty");
		}
		
	}

}
