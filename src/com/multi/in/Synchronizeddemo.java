package com.multi.in;
class Test{
	 
	public  synchronized void Happy(String aname) {
		for (int i = 0; i <5; i++) {
			
			System.out.println("in synschronized block");
			}	
	}
	
}


public class Synchronizeddemo extends Thread {
	
	Test t;
	String name;
	
	
	public Synchronizeddemo(Test t, String name) {
		super();
		this.t = t;
		this.name = name;
	}


	public void run() {
           for (int i = 0; i<10; i++) {
	                System.out.println("run method excuted");
	                  t.Happy(name);
	                         
          }
           
}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		Synchronizeddemo d1=new Synchronizeddemo(t1, "abc");
		Synchronizeddemo d2=new Synchronizeddemo(t1, "ac");
	d1.start();
	d2.start();
		
	}
	
	/*public static void main(String[] args) {
		
		System.out.println("hello java");
		
		Demomulti t1=new Demomulti();
		t1.start();
		
		
		
		
	}*/
	
	

}
		
		
	
