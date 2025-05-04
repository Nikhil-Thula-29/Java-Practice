package com.nt.multithreading;

public class TestMultiThreading {

	public static void main(String[] args) throws Exception {
		// main method has default thread name main so count it by default
//		System.out.println("Hello guys");
//		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getPriority());

//		Thread t1=new Thread();
//		Thread t2=new Thread();
//		Thread t3=new Thread();
//		Thread t4=new Thread();
//		t1.start(); 
//		t2.start(); 
//		t3.start(); 
//		t4.start(); 
//		System.out.println(Thread.activeCount());	//2 t1.start()+main (when only t1 is there)

		// 1.method
//		Employee e1=new Employee("T1");
//		e1.start();
//		
//		
//		Manager m1=new Manager("T2");
//		m1.start();
//		
//		System.out.println(Thread.activeCount());

		// 2.method
//		Employee e1=new Employee();
//		Thread t1=new Thread(e1);
//		t1.start();
//		
//		
//		Manager m1=new Manager();
//		Thread t2=new Thread(m1);
//		t2.start();
//		
//		System.out.println(Thread.activeCount());

		// method 3 anonymous class
//		Runnable r1=new Runnable() {
//			public void run() {
//				System.out.println("Hello "+Thread.currentThread().getName());
//			}
//		};
//		
//		
//		Runnable r2=new Runnable() {
//			public void run() {
//				System.out.println("Hi "+Thread.currentThread().getName());
//			}
//		};
//		
//		Thread t1=new Thread(r1);
//		Thread t2=new Thread(r2);
//		t1.start();
//		t2.start();
//		System.out.println(Thread.activeCount());

		// 4.lambda
		Runnable r1 =()->{
				System.out.println("Hello " + Thread.currentThread().getName());
		};

		Runnable r2 =()->{
			System.out.println("Hi " + Thread.currentThread().getName());
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
		
		//t1.join();	//used for stoping the second thread before the execution of 1st thread
		//t1.sleep(10000);
		System.out.println(t1.getState());
		
		//thread lifecycle (0,1,2,3,4,5->indexes)
		//test by t1.getState();
		//0-New
		//1-Runnable
		//2-Blocked
		//3-Waiting(join)
		//4-Timed Waiting(specific time/sleep)
		//5-Terminated
	}
}

//1.METHOD
//class Employee extends Thread{
//	
//	public Employee(String tName) {	//thread name
//		super(tName);
//	}
//	
//	 @Override
//	 public void run() {
//		 System.out.println("Hello "+Thread.currentThread().getName()+">>>"+getId());
//	 }
//}
//
//class Manager extends Thread{
//	
//	public Manager(String tName) {
//		super(tName);
//	}
//	 @Override
//	 public void run() {
//		 System.out.println("Hii "+Thread.currentThread().getName()+">>>"+getId());
//	 }
//}

//2 METHOD
//class Employee implements Runnable{
//	
//	
//	 @Override
//	 public void run() {
//		 System.out.println("Hello "+Thread.currentThread().getName());
//	 }
//}
//
//class Manager implements Runnable{
//	
//	 @Override
//	 public void run() {
//		 System.out.println("Hii "+Thread.currentThread().getName());
//	 }
//}
