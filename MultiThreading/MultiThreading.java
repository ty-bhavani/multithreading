package com.tyss.MultiThreading;



public class MultiThreading {
	

	public static void main(String[] args) throws InterruptedException 
	{
		//Thread t=new Thread();
		
		MyThread1 m=new MyThread1();
		// t.yield();
		
		System.out.println("before start "+m.isAlive());
		m.start();
		//m.run();
		System.out.println("after start "+m.isAlive());
		m.join();
	
		
		MyThread2 m2=new MyThread2();
		m2.start();
		//m2.run();
		m2.setPriority(8);
        System.out.println("priority of thread:"+m2.getPriority());
	}
}
		
		

        
	

        
