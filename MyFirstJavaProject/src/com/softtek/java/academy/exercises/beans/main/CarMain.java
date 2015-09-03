package com.softtek.java.academy.exercises.beans.main;

import java.util.Scanner;

import com.softtek.java.academy.exercises.beans.Car;



public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce your car's velocity:");
		int v = s.nextInt();
		c.setVelocity(v);
		CarMain cm = new CarMain();
		cm.showVelocityCar(c);

	}

	void showVelocityCar(Car c) {
		System.out.println("The car's velocity is: " + c.getVelocity() + "km/h");
		
	}

}
