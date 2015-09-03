package com.softtek.java.academy.exercises.arrays;

public class BiArraysMain {
	
	public static void main(String[] args) {
		
		int[][] biArray = {{1,4,5},{3,6,2,8,12},{3,5,1}};
		PrintBiArrays printBi = new PrintBiArrays();
		System.out.println(printBi.printBiArray(biArray));
		System.out.println(printBi.printBiArray2(biArray));
		
		
	}

}
