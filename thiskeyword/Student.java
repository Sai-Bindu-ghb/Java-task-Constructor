package com.thiskeyword;

public class Student {

	int rollNo;
	String name;
	
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;	
		System.out.println("rollNo: "+rollNo +"\nname: "+name);
	}
	public void updateDetails(String name) {
		this.name=name;
		
	}
	public void display() {
		System.out.println("rollNo: "+rollNo +"\nname :"+name);
	}
	public static void main(String[] args) {
		
		Student s=new Student(123,"bindu");
		System.out.println("-----------------------");
		s.updateDetails("sindu");
		s.display();
	}

}
