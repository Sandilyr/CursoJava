package com.softtek.java.academy.exercises.control;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero2 {
	
public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt(101);
		System.out.println(n);
		Scanner s = new Scanner(System.in);
		System.out.println("Estoy pensando un numero entre el 1 y el 100, cual crees que es?");
		int num = s.nextInt();
		
		int i=1;
		int dif = Math.abs(num-n);
		while (dif != 0){
			
			if (dif > 80) {
				System.out.println("muy frio, ");
				num = s.nextInt();
				dif = Math.abs(num-n);
			}else if(dif > 60) {
				System.out.println("frio, ");
				num = s.nextInt();
				dif = Math.abs(num-n);
			}else if(dif > 40) {
				System.out.println("tibio, ");
				num = s.nextInt();
				dif = Math.abs(num-n);
			}else if(dif > 20) {
				System.out.println("caliente, ");
				num = s.nextInt();
				dif = Math.abs(num-n);
			}else if(dif > 0) {
				System.out.println("muy caliente, ");
				num = s.nextInt();
				dif = Math.abs(num-n);
			}
			
			
			
			i++;

		}
		
		System.out.println("ese es el numero! y lo atinaste en el intento: " + i );

	}
	

}
