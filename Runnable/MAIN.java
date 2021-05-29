package com.tyss.Runnable;

public class MAIN {

	public static void main(String[] args)
	{
		MyThread m=new MyThread();//implemention class obj
		Thread t=new Thread(m);//thread object
		//t.start();
		t.run();
		
	}

}
