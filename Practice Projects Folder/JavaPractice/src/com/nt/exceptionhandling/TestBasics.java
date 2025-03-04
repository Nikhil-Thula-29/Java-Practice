package com.nt.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


//super of class all exceptions is exception and exception super class is throwable and it's is object
public class TestBasics {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Program starts");
		int fno=10;
		int sno=0;
		int res;
		
		//File file=new File("D:/resume.docx");
		//FileInputStream fis=new FileInputStream(file);	//here without throws it gives error bcz handling with file there file may be there or may not directly by throws it handles
		
		
		//by using try catch we can run remaining program also even though got error
		try {
			res=fno/sno;
			System.out.println(res);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			throw e;		//throw is used to throw exception to java so that it stops the execution and stops remaining code execution
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
