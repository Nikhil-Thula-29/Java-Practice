package com.nt.pojoandjavabeanclass;

public class Test {

	public static void main(String[] args) {
		//POJO Class
		Employee emp=new Employee();
		emp.setId(100);
		emp.setName("Nikhil Thula");
		emp.setSalary(1000000);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

		//Java Bean class
		Student std=new Student();
		std.setId(200);
		std.setName("Raj Kumar");
		std.setSchool("Delta high school");
		
		System.out.println(std.getId());
		System.out.println(std.getName());
		System.out.println(std.getSchool());
	}

}
