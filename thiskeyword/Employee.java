package com.thiskeyword;

public class Employee {
	
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		
		
		this.name=name;
		this.salary=salary;
		
		
	}
	public void setSalary(String name,double salary) {
		
		this.name=name;
		this.salary=salary;
		
	}
	public void display() {
		
		System.out.println("name: "+name +"\nsalary :"+salary);
	}

	public static void main(String[] args) {
	
		Employee emp=new Employee("triveni",60000.0);
		System.out.println("Before updation:");
		emp.display();
		System.out.println("-------------------------");
	    emp.setSalary("bindu",50000.0);
		System.out.println("After updation:");
		emp.display();
    
	}

}
