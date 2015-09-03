package com.softtek.java.academy.exercises.control;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumeroMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt(101);
		System.out.println(n);
		Scanner s = new Scanner(System.in);
		System.out.println("Estoy pensando un numero entre el 1 y el 100, cual crees que es?");
		int num = s.nextInt();
		
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


