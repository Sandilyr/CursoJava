package com.softtek.java.academy.threads;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimeCounterTest {

	
	@Test
	public void timePause(){
		
		TimeCounterRunnable timeCounterRunnable = new TimeCounterRunnable();
		Thread thread1 = new Thread(timeCounterRunnable);
		
		thread1.start();

		 try {
	            assertTrue(thread1.getState().toString() == "RUNNABLE");
	            Thread.currentThread().join(20000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		
       // thread1.start();

       
		
	}
	
}
