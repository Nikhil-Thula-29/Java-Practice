package com.nt.fileshandlingandtexthandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingOutput {

	public static void main(String[] args) throws IOException {
		File f=new File("./test.txt");
		System.out.println(f.exists());
		if(f.exists()){
			System.out.println(f.delete());
			System.out.println(f.createNewFile());
		}

		//1. FileOutputStream
//		String s="hello";
//		FileOutputStream fos=new FileOutputStream(f);
//		for(char val:s.toCharArray()) {
//			fos.write((int)val);	//to convert to asci
//		}	
		
//		fos.write(72);
//		fos.write(65);
//		fos.write(69);
//		fos.write(70);
//		fos.write(63);	
//		fos.close();
		
		
		//2. FileWriter
//		String s="Hello Nikhil Thula Iam from tcs";
//		FileWriter fw=new FileWriter(f);
//		fw.write(s);
//		fw.flush();		//same as close
//		fw.close();	
		
		
		//3.BufferedWriter(Here we need to pass which extends reader class like Filewriter)
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		String s="Hey man ALL THE BEST";
		fw.write(s);
		fw.flush();
		fw.close();
		
	}

}
