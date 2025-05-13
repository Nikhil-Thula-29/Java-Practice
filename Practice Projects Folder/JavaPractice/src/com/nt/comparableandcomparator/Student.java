package com.nt.comparableandcomparator;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student anotherStudent) {
		int x=this.rollno;
		int y=anotherStudent.rollno;
		//taken this from integer class open and check in comparable interface
		//return (x < y) ? -1 : ((x == y) ? 0 : 1);
		//or
		//return x-y;
		//or
		return Integer.compare(this.rollno, anotherStudent.rollno); //for ascending order(integer) 
		//return this.name.compareTo(anotherStudent.name);	//for ascending order;(Strings)
		//return anotherStudent.name.compareTo(this.name);	//for descending order;(strings)
		//return Integer.compare(anotherStudent.rollno, this.rollno);	//for descending order(integer);
	}
	
	
	
}
