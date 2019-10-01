package com.multi.in;

public class Daemondemo extends Thread {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		

		Daemondemo d=new Daemondemo();
		System.out.println(d.isDaemon());
		d.setDaemon(true);
		System.out.println(d.isDaemon());
		d.start();
		d.setDaemon(true);   //java.lang.IllegalThreadStateException
		
		System.out.println("my commit");
	}
	
}
