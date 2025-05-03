package com.nt.memory;

public class GarbageCollectionPractice {
	
	//executes internally when it calls System.gc();
	public void finalize() {
		System.out.println("In finalize method");
	}

	//manual garbage collection process
	public static void main(String[] args) {
		//unused obj
		//unreferenced obj
		//anonymous obj
		
		
		GarbageCollectionPractice gc1=new GarbageCollectionPractice();
		GarbageCollectionPractice gc2=new GarbageCollectionPractice();
		GarbageCollectionPractice gc3=new GarbageCollectionPractice();
		gc1=null;	//making null gc1 so no use then finalize once called;
		gc2=gc3;	//making gc2 = to gc3 then gc2 no use same finalize called
		System.gc();
	}
}
