package com.softtek.java.academy.exercises.arrays;

public class PrintBiArrays {
	
	public String printBiArray(int[][] biArr) {
		
		StringBuffer sb = new StringBuffer("[");
		for (int i=0; i < biArr.length; i++) {
			sb.append("[");
			for (int elem : biArr[i]) {
				sb.append(elem + ",");
			}
			
			sb.append("],");
			int k = sb.indexOf(",]");
			sb.deleteCharAt(k);
		}
		
		int j = sb.lastIndexOf(",");
		sb.deleteCharAt(j);
		sb.append("]");
		
		return sb.toString();
	}
	
	
	public String printBiArray2(int[][] biArr) {
		
		StringBuffer sb = new StringBuffer("[");
		
		for (int i=0; i < biArr.length; i++) {
			for (int elem : biArr[i]) {
				sb.append(elem + ",");
			}
			
		}
		
		int j = sb.lastIndexOf(",");
		sb.deleteCharAt(j);
		sb.append("]");
		
		return sb.toString();
	}

}
