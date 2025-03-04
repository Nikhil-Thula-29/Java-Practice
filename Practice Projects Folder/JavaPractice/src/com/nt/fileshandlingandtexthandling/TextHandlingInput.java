package com.nt.fileshandlingandtexthandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextHandlingInput {

	public static void main(String[] args) throws IOException {
		File f=new File("./sample.txt");
		f.createNewFile();
		
		//1.FileInputStream
//		FileInputStream fis=new FileInputStream(f);	//gives asci values
//		int asci;
//		String text = "";
//		while((asci=fis.read())!=-1) {
//			text=text+String.valueOf((char)asci);
//			//System.out.print((char)asci);
//		}
//		System.out.println(text);
		
		
		
		//2.Scanner
//		Scanner sc=new Scanner(f);
//		String text="";
//		while(sc.hasNext()) {	//or can hasNextLine
//			text=text+sc.nextLine();
//			//System.out.println(sc.nextLine());
//		}
//		System.out.println(text);
		
		
		//3.FileReader
		//It is same as FileInputStreamReader
//		FileReader fr=new FileReader(f);
//		int asci;
//		String text = "";
//		while((asci=fr.read())!=-1) {
//			text=text+String.valueOf((char)asci);
//			//System.out.print((char)asci);
//		}
//		System.out.println(text);
//		fr.close();
		
		//4.BufferReader(In buffereader we need to pass which extends Reader class i.e Fileinputstream or FileReader)
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);	//we can get char by char and line by line also
		
//		char by char
		
//		int asci;
//		String text = "";
//		while((asci=br.read())!=-1) {
//			text=text+String.valueOf((char)asci);
//			//System.out.print((char)asci);
//		}
//		System.out.println(text);
//		br.close();		//need to close
		
		
		//Line by Line
		String text=new String();
		String line=new String();
		while((line=br.readLine())!=null){
			text=text+line+"\n";
			//System.out.println(line);
		}
		System.out.println(text);
		fr.close();
		br.close();
	}
}
