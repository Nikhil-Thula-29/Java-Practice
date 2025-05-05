package com.nt.casting;

public class TypeConversion {

	public static void main(String[] args) {
		//smaller to larger data type.
		//we can convert large to small easily but for reverse we need manual conversion
		byte b=10;	//-128 to 127
		short s=50;
		int i=300;
		float f=25.1f;
		long l=785463;
		double d=52.55;
		
		char ch='A';
		boolean bo=true;
		
		//f=b;	implicit or automatic 
		//b=(byte)s;	//explicit conversion
		b=(byte)i;
		System.out.println(b);
		System.out.println(b);
		
		float b2=b+f;
		System.out.println(b2);
		System.out.println('A'+'B');	//o/p=131 ascii values + 65+66
		System.out.println('A'+5+6565265); //o/p=6565335
		System.out.println('A'/'B');	//0
	}

}

//0,1,2...127,-128,-128,-126,....0,1,2... total are 256 (300-256=44) line 20 o/p