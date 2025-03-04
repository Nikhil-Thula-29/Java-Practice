package com.nt.oops.Inheritance;

public class IUser implements IAdmin{

	public static void main(String[] args) {
		IUser user=new IUser();
		user.read();
		user.write();
		user.manage();
	}
	@Override
	public  void read() {
		System.out.println("Read in interface");
		
	}

	@Override
	public void write() {
		System.out.println("Write in Interface");
		
	}

	@Override
	public void manage() {
		System.out.println("Manage in Interface");
		
	}
}
