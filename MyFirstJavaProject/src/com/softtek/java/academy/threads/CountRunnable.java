package com.softtek.java.academy.threads;

import org.junit.Test;

public class CountRunnable implements Runnable {
	

	private String message = "hola sandy";

	@Test
	@Override
	public void run() {
		for (int i=0; i<10;i++){
			System.out.println(message + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
                e.printStackTrace();
            }
			
			
		}
		
	}
	
	

}
