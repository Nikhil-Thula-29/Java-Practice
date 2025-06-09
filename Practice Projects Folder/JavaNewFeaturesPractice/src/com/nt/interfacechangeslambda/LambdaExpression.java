package com.nt.interfacechangeslambda;

public class LambdaExpression {

	void add(int x,int y) {
		int i=x+y;
		System.out.println(i);		
	}
	
	void show(Employee e) {
		System.out.println(e.getId()+" "+e.getName());
	}
	
	void run(Testing t) {
		System.out.println("In side testing interface");
	}
	
	public static void main(String[] args) {
		LambdaExpression le=new LambdaExpression();
		//Here we are passing data 
		le.add(10, 20);
		
		
		//Here also we are passing data 
		Employee e=new Employee();
		e.setId(1);
		e.setName("Vijay");
		le.show(e);
		
		//Here we are passing interface
		Testing t=new A();
		le.run(t);
		//But lambda helps in functional programming i.e sending "functionality" as method argument.
		//before 1.8 we can not pass functionality as method arg but after it changed
		//this is functionality
		//lambda enables functional programming
		Testing t1=()->{
			System.out.println("In functional t1 method");
		};
//		le.run(t1);
		//or
		//this is functionality
		le.run(()->System.out.println("Inside functional programming"));
		
//		Testing t2=((x,y)->{
//			int z=x+y;
//			return z;
//		});
//		
//		System.out.println(t2.display(20, 30));
//		le.run(t2);
		
	}
}
