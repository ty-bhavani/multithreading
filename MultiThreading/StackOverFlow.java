package com.tyss.MultiThreading;

public class StackOverFlow {

	public static void main(String[] args) {
      count(5);
	}
	static void count(int i)
	{
		if(i==0)
		{
			System.out.println("count");
		}
		else
		{
			count(i++);
		}
	}

}
