package com.nt.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesPractice {

	public static void main(String[] args) throws IOException {
		File file=new File("dbconfig.properties");
		if(!file.exists()) {
			file.createNewFile();
		}
		Properties prop=new Properties();
//		prop.setProperty("url", "localhost");
//		prop.setProperty("username", "nikhil");
//		prop.setProperty("password", "nik123");
//		FileOutputStream fos=new FileOutputStream(file);	//for writing the matter into the file
//		prop.store(fos, "New prop file is created");
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		Set<String> keys=prop.stringPropertyNames();
		Set<Object> keyss=prop.keySet();
		Collection<Object> values=prop.values();
		System.out.println(keys);
		System.out.println(keyss);
		System.out.println(values);
		for(Object key:prop.keySet()) {
			System.out.println(key+">>>>"+prop.getProperty((String) key));
		}
		Set<Entry<Object,Object>> data=prop.entrySet();
		for(Entry<Object,Object> entry:data) {
			System.out.println(entry.getKey()+">>>>"+entry.getValue());
		}
		
	}
}
