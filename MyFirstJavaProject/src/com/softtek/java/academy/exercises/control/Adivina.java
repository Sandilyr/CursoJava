package com.softtek.java.academy.exercises.control;

import java.util.Scanner;

public class Adivina {

	public void comparaNum(int n, int num ){
		Scanner s = new Scanner(System.in);
		int i=1;
		while (num != n){
			
			if (num > n) {
				System.out.println("menos: ");
				num = s.nextInt();
			}else if(num < n) {
				System.out.println("mas: ");
				num = s.nextInt();
			}
			
			i++;

		}
		
		System.out.println("ese es el numero! y lo atinaste en el intento: " + i );
	}

	
}
