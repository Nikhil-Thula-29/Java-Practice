package com.nt.lambdaexpressions;

//62 
public class ClassA {

	public static void main(String[] args) {
		
		Audi a=new Audi();
		System.out.println(a.getSpeed());
		
		Car c1=new Car() {	//anonymous class
			public int getSpeed() {
				System.out.println("Driving BMW");
				return 150;
			}
		};
		System.out.println(c1.getSpeed());
		
		//Lambda expression with anonymous function(because of only one method in functional interface)
		//3 componenets: arguments list, arrow token,function body
		//(arguments)->{ function body }
		Car c2=() -> {
				int speed=93;
				System.out.println("Driving tata");
				System.out.println("Car is driving at speed of: "+speed);
				return speed;
		};
		//we can do more shortcut i.e no braces	(rem:semicolon)
		//()-> System.out.println("Driving tata");
		//()->100;
		System.out.println(c2.getSpeed());

		
	}

}

class Audi implements Car{

	@Override
	public int getSpeed() {
		System.out.println("Audi is driving");	
		return 60;
	}
	
}

@FunctionalInterface
interface Car{
	public int getSpeed();
}