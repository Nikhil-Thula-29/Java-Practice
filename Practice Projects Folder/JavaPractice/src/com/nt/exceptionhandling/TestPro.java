package com.nt.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPro {

	public static void main(String[] args) throws IOException, LoginException {
		File f=new File("./sample.txt");
		f.createNewFile();
		
		//AutoClosable
		//We cant keep everything inside we can keep only which extends autocloasable classes these all are extending autocloasable.
		//bcz which helps in not close every time like fr.close,fis.close,isr.close(),.....
		try(FileReader fr=new FileReader(f);
			FileInputStream fis=new FileInputStream(f);
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);	) {
			//gives asci values
			int asci;
			String text = "";
			while((asci=fis.read())!=-1) {
				text=text+String.valueOf((char)asci);
				//System.out.print((char)asci);
			}
			System.out.println(text);
			System.exit(0);	//used to stop finally block bcz of threads fails
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayStoreException | IOException e) {
			e.printStackTrace();
		}catch(SecurityException se) {
			throw new SecurityException("Stupid Fellow this is Security Exception");
		}catch(StringIndexOutOfBoundsException le) {
			throw new LoginException("Login is failed");
		}
		finally {
			System.out.println("Finally");
		}
			
	}
}
