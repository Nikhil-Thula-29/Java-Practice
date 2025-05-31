package com.nt.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaPractice {

	String s="nikhil";
	int i=10;
	
	//outside the main method
	public void add() {
		Test t=()->{
			System.out.println("In display name");
		};
		t.display();
	}
	
	
	public static void main(String[] args) {
		
		LambdaPractice lp=new LambdaPractice();
		lp.add();
		Test2 t2=(x)->{
			System.out.println("In show method ");
			return x;
		};
		
		System.out.println(t2.show(10));
		
		Test3 t3=(s)->{
			System.out.println(s);
		};
		t3.show("nikhil");
		
		Test4 t4=()->{
			return "kiran";
		};
		
		System.out.println(t4.show());
		
		
		//start
		
		Function<String, Integer> fun=(h)->{
			int value=205;
			System.out.println(h);
			return value;
		};
		int result=fun.apply("harish");
		System.out.println(result);
		
		
		
		//this is predicate
		Predicate<String> pred=(val)->{
			System.out.println(val);
			return true;
		};
		System.out.println(pred.test("vamshi"));
		
		//this is same as Test3 taking int and returing void
		Consumer<Integer> con=(c)->{
			System.out.println(c);
		};
		con.accept(35);
		
		
		
		//same as Test4 so no need but keeping just for reference not taking any obj and returing something
		Supplier<String> sup=()->{
			return "vijay";
		};
		System.out.println(sup.get());
		
		//most possible interfaces
		//1.String method(int );--function
		//2.String method();--supplier
		//3.void method(int);--consumer
		//4.void method();--runnable
		//boolean method(int);--predicate
	}
	
	
	
}
