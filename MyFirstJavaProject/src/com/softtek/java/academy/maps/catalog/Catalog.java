package com.softtek.java.academy.maps.catalog;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.softtek.java.academy.collections.basic.examples.UsersList;




public class Catalog {
	
	
	public static void main(String[] args) {
		

		Map<String, List<Book>> booksMap = new HashMap<String, List<Book>>(); 
		
		List<Book> bookList1 = new ArrayList<Book>();
		List<Book> bookList2 = new ArrayList<Book>();
		List<Book> bookList3 = new ArrayList<Book>();
		List<Book> bookList4 = new ArrayList<Book>();
		List<Book> bookList5 = new ArrayList<Book>();
		List<Book> bookList6 = new ArrayList<Book>();
		
		bookList1.add(new Book("Hearts Made Whole", "Hedlund, Jody", "9781441269492", "Minneapolis, Minnesota : Bethany House, a division of Baker Publishing Group, [2015]"));
		bookList1.add(new Book("A Slant of Light", "Lent, Jeffrey", "9781620404973 ", "New York : Bloomsbury USA, 2015"));
		bookList1.add(new Book("Silent Creed", "Kava, Alex", "9781410477286 ", "Waterville, Maine : Thorndike Press Large Print, 2015"));
		
		bookList2.add(new Book("sdfsdf", "gfgf", "65465", "nla"));
		bookList2.add(new Book("", "", "", ""));
		bookList2.add(new Book("", "", "", ""));
		
		bookList3.add(new Book("Hearts Made Whole", "Hedlund, Jody", "9781441269492", "Minneapolis, Minnesota : Bethany House, a division of Baker Publishing Group, [2015]"));
		bookList3.add(new Book("", "", "", ""));
		bookList3.add(new Book("", "", "", ""));
		
		bookList4.add(new Book("sds", "sds", "dfg", "cvb"));
		bookList4.add(new Book("", "", "", "cvb"));
		bookList4.add(new Book("", "", "", ""));
		
		bookList5.add(new Book("", "", "", ""));
		bookList5.add(new Book("dfg", "rte", "ter", "hrt"));
		bookList5.add(new Book("ert", "ert", "fgd", "erte"));
		
		bookList6.add(new Book("ert", "ert", "ert", "gf"));
		bookList6.add(new Book("gfd", "gfd", "gfd", "fgd"));
		bookList6.add(new Book("dfg", "fgdf", "dfg", "dfgd"));
		
	
	    booksMap.put("Fiction", bookList1);
		booksMap.put("History", bookList2);
		booksMap.put("Literature", bookList3);
		booksMap.put("Science", bookList4);
		booksMap.put("Biography", bookList5);
		booksMap.put("Religion", bookList6);
		

		//for(Map<String, List<Book>> map : HashMap booksMap)
		
		//check map using contains
		for (int j=0; j<bookList3.size();j++){
			if (bookList1.contains(bookList3.get(j))){
				System.out.println("repetido: " + bookList3.get(j));
			}
		};
		
		//check map Elements
		
		/*
		UsersList ul = new UsersList();
		List keys = new ArrayList(booksMap.keySet());
		
		for (int k=0; k<keys.size();k++){
			for (int i = 0; i < keys.size(); i++) {
				
					ul.compareList(booksMap.get(keys.get(i)), booksMap.get(keys.get(k)));
				
			
			}
		}
		*/
		

	

		
	}

}

