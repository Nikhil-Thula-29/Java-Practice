package com.nt.multithreading;

public class TestingMultiThreading {

	public static void main(String[] args) throws Exception{
		BrickDairy bd=new BrickDairy();
		
		Runnable r1=()->{
			for(int i=0;i<10000;i+=50) {
				bd.incrementBrickCount();
			}
		};
		
		Runnable r2=()->{
			for(int i=0;i<15000;i+=50) {
				bd.incrementBrickCount();
			}
		};
		
		Runnable r3=()->{
			for(int i=0;i<5000;i+=50) {
				bd.incrementBrickCount();
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3); 
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println(bd.brickCount);

	}

}

class BrickDairy{
	//volatile int brickCount=0;	//volatile same as synchorinzed but not working
	int brickCount=0;	
	public synchronized void incrementBrickCount() {	//if we remove this synchronized word then data loss will happen 
		brickCount+=50;
	}
}