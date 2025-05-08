package com.nt.genericspractice;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
//		Box<Almond> almondbox=new Box<Almond>(10);
//		almondbox.adding(new Almond("california almond"));
//		almondbox.adding(new Almond("austrila almond"));
//		almondbox.adding(new Almond("india almond"));
//		almondbox.adding(new Almond("nz almond"));
//		
//		
//		System.out.println(almondbox.getting(3));
//		
//		Box<Cashew> cb=new Box<Cashew>(5);
//		cb.adding(new Cashew("Aus Cashew"));
//		cb.adding(new Cashew("india Cashew"));
//		cb.adding(new Cashew("nz Cashew"));
//		cb.adding(new Cashew("china Cashew"));
//
//		System.out.println(cb.getting(3));
//		
//		
//		
//		ArrayList<Almond> al=new ArrayList<>();
//		al.add(new Almond("good almond"));
//		
//		System.out.println(al.get(0));
		
		swap(5,20);
		swap("hello","world");
		swap(true,false);
		swap(20.65,60.85);
		
		ArrayList<Pair<String,Integer>> alval=new ArrayList<>();
		alval.add(new Pair("dsnr",218));
		alval.add(new Pair("koti",252));
		alval.add(new Pair("miyapur",365));
		System.out.println(alval);
		
	}
	
	
	public static <T> void swap(T i,T j) {	//<T extends Number> check this only for int,double not strings
		System.out.println("Befor swapping "+i+" >> "+j);
		T temp;
		temp=i;
		i=j;
		j=temp;
		System.out.println("After swapping "+ i + " >> "+j);
	}
	
//	public static void swap(String i,String j) {
//		System.out.println("Befor swapping "+i+" >> "+j);
//		String temp;
//		temp=i;
//		i=j;
//		j=temp;
//		System.out.println("After swapping "+ i + " >> "+j);
//	}
}

class Pair<K,V>{
	K key;
	V value;
	
	public Pair(K key,V value) {
		this.key=key;
		this.value=value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
	
}

class Almond{
	String name;
	public Almond(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Almond [name=" + name + "]";
	}
	
	
	
}
class Cashew{
	String name;
	public Cashew(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Cashew [name=" + name + "]";
	}
	
	
	
}



class Box<T>{	
	T[] dryFruits;
	int index;


	public Box(int size) {
		dryFruits=(T[]) new Object[size];
		index=0;
		System.out.println("inside con");
	}
	
	public void adding(T dryFruit) {
		dryFruits[index]=dryFruit;
		index++;
	}
	
	public T getting(int i) {
		return dryFruits[i];
	}

	
	
}

//class AlmondBox{	
//	Almond[] almonds;
//	int index;
//
//
//	public AlmondBox(int size) {
//		almonds=new Almond[size];
//		index=0;
//		System.out.println("inside con");
//	}
//	
//	public void adding(Almond almond) {
//		almonds[index]=almond;
//		index++;
//	}
//	
//	public Almond getting(int i) {
//		return almonds[i];
//	}
//
//	
//	
//}

//class CashewBox{	
//	Cashew[] cashews;
//	int index;
//	
//	public CashewBox(int size) {
//		cashews=new Cashew[size];
//		index=0;
//		System.out.println("inside con");
//	}
//	
//	public void adding(Cashew cashew) {
//		cashews[index]=cashew;
//		index++;
//	}
//	
//	public Cashew getting(int i) {
//		return cashews[i];
//	}
//
//
//}