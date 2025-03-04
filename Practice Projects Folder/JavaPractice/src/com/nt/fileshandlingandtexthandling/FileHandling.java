package com.nt.fileshandlingandtexthandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	//we can use // or \ for separaters
	public static void main(String[] args) throws IOException {
		//File f=new File("F:\\TestFiles\\resume.txt");		//absolute path inside folder
		//File f=new File("./resume.txt");	//relative path inside eclipse
		//File f=new File("./Test/Resume");	//relative path inside eclipse
		File f=new File("F:\\Nikhil Java\\Practice Projects Folder\\JavaPractice");	
		System.out.println(Arrays.toString(f.list()));
		System.out.println(Arrays.toString(f.listFiles()));
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		
		//System.out.println(f.mkdir());		//there is no methods for folders mkdir and mkdirs is the methdos in file to create folders multiple go for mkdirs
		//System.out.println(f.mkdirs());
//		if(!f.exists()) {
//			f.delete();
//			System.out.println(f.createNewFile());
//		}		
		//System.out.println(f.delete());
		//System.out.println(f.exists());
		//System.out.println(f.isHidden());
		//System.out.println(f.canWrite());
		
	}
}
