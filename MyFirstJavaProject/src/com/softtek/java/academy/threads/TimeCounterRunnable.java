package com.softtek.java.academy.threads;

public class TimeCounterRunnable implements Runnable{

	
	
	
	@Override
	public void run() {
		
		for (int i=1; i<50; i++){
			System.out.println(i);
			try {
	    		 Thread.sleep(1000);
	         }	 catch (InterruptedException e) {
	             	e.printStackTrace();
	         }
			if (i==10){
		
					MessageRunnable messageRunnable = new MessageRunnable();
		 		 	Thread thread2 = new Thread(messageRunnable);
		 		 	try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    		thread2.start();
		 
			}

		
			
		}
		
		
		
		
	}
	
	

}
