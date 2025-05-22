package com.thiskeyword;

public class Product {
	
	int id;
	
	double price;
	
	public Product(int id,double price) {
		this.id=id;
		this.price=price;
	}
	public boolean isSame(Product p) {
		return this.id==p.id;	
		
	}
	public void test() {
		System.out.println("product Id: "+id +"\nproduct price: "+price);
	}

	public static void main(String[] args) {
		Product p1=new Product(123,60000);
		Product p2=new Product(123,50000);
		p1.test();
		p2.test();
		if(p1.isSame(p2)) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("\nboth are not same");
		}
		

	}

}
