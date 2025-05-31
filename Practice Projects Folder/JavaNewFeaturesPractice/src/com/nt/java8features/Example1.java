package com.nt.java8features;

public class Example1 implements Test {

    public static void main(String[] args) {
        System.out.println("Inside main");
        Test.add();
        Example1 ex=new Example1();
        ex.display(); 
        ex.usemethod();
    }

    @Override
    public void display() {
        System.out.println("Inside display method");
    }
    
    //static methods can not rewrite.
    //static will help in utility methods
    
    //we are creating extra method beacuse it is non static method
    public void usemethod() {
    	//Interface.super.methodname;
    	Test.super.show();
    }
}
