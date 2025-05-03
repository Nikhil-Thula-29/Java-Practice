package com.nt.memory;

public class Employee {
	int orgId=4554;
	String orgName="NTCS";
	String ceo="Nikhil";
	static int noOfDepts=22;
	
			
	public static void main(String[] args) {
		int eid=101;
		String empname="vijay";
		double sal=5555;
		
		Employee e1=new Employee();
		e1.getOrgId();
		System.out.println(Employee.getNoOfDepts());
		
	}
	
	public int getOrgId() {
		return orgId;
	}
	
	public static int getNoOfDepts() {
		return noOfDepts;
	}
	
	public void deleteEmployee(int eid) {
		
	}
}
