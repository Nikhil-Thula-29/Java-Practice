package com.nt.innerclasses;

// non-static inner classes
// static inner classes
// local classes
// anonymous inner classes/anonymous classes
public class TestClass1 {
	private int id = 101;

	public static void main(String[] args) {
		System.out.println("In main1 method");
		TestClass1 tc1=new TestClass1();
		Test4 t4=tc1.new Test4();	//accessing using outerclass object
		t4.show();
		t4.add();
		Test5 t5=tc1.new Test5();	//accessing using outerclass object
		t5.show();
		t5.add();
	}

	public class Test4 extends Student {
		
		private int id=102;
		public void show() {
			int id=103;
			System.out.println(id);
			System.out.println(this.id);
			System.out.println(TestClass1.this.id);
			System.out.println(getmarks());
		}
		
		public void add() {
			Test4 t4=new Test4();
			t4.show();
		}
		
	}

	
	
public class Test5 extends Student2 {
		
		private int id=102;
		public void show() {
			int id=103;
			System.out.println(id);
			System.out.println(this.id);
			System.out.println(TestClass1.this.id);
			System.out.println(getmarks());
			giveExam();
		}
		
		public void add() {
			Test5 t5=new Test5();
			t5.show();
		}

		@Override
		public void giveExam() {
			System.out.println("given");
			
		}
		
	}
	
	
	protected class Test8 {

	}

	public static class Test6 {

	}

	protected abstract class Test7 {

	}

}

class TestClass2 {
	public static void main(String[] args) {
		System.out.println("In main2 method");
	}
}

class TestClass3 {

}