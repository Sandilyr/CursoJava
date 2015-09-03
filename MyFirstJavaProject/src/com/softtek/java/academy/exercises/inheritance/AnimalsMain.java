package com.softtek.java.academy.exercises.inheritance;

public class AnimalsMain {

	public static void main(String[] args) {
		
		Animals tiger1 = new Tiger();
		Animals bird1 = new Bird();
		Animals dolphin1 = new Dolphin();
		Animals panda1 = new Panda();
		Animals cat1 = new Cat();
		
		tiger1.drink();
		tiger1.eat();
		tiger1.sleep();
		
		bird1.drink();
		bird1.eat();
		bird1.sleep();
		
		dolphin1.drink();
		dolphin1.eat();
		dolphin1.sleep();
		
		panda1.drink();
		panda1.eat();
		panda1.sleep();
		
		cat1.drink();
		cat1.eat();
		cat1.sleep();
		
		Tiger tiger2 = new Tiger();
		Bird bird2 = new Bird();
		Dolphin dolphin2 = new Dolphin();
		Panda panda2 = new Panda();
		Cat cat2 = new Cat();
		
		tiger2.drink();
		tiger2.eat();
		tiger2.sleep();
		
		bird2.drink();
		bird2.eat();
		bird2.sleep();
		
		dolphin2.drink();
		dolphin2.eat();
		dolphin2.sleep();
		
		panda2.drink();
		panda2.eat();
		panda2.sleep();
		
		cat2.drink();
		cat2.eat();
		cat2.sleep();
	
		
	}

}
