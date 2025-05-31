package com.nt.java8features;

public interface Test {
    public void display();
    
    
    //default methods in interface will provide backward comptability.
    default void show() {
        System.out.println("Inside default show");
    }
    
    static void add() {
        System.out.println("inside add static");
    }

    default void substract() {
        System.out.println("Inside substract method");
    } 
    
   // public void sub();
}
