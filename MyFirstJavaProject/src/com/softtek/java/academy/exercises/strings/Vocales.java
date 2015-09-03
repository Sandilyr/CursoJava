package com.softtek.java.academy.exercises.strings;

 class Vocales {

		
	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Sandily Rivera Galvez tiene mucho sueño");
		StringBuffer vocalName = new StringBuffer();

		for (int i=0; i < name.length();i++){
			if (name.charAt(i)=='a'||name.charAt(i)=='e' || name.charAt(i)=='i'||name.charAt(i)=='o' || name.charAt(i)== 'u') {
				
				vocalName.append(name.charAt(i));
	
				
			}
		}
		
		System.out.println(vocalName);

	}

}
