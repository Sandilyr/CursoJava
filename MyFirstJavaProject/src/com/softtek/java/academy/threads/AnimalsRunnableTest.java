package com.softtek.java.academy.threads;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AnimalsRunnableTest{
	
	
 @Test
    public void printMap() {

	 	AnimalsRunnable animalsRunnable = new AnimalsRunnable();
	 	Thread thread = new Thread(animalsRunnable);
        thread.start();

        try {
            assertTrue(thread.getState().toString() == "RUNNABLE");
            Thread.currentThread().join(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
 }