package com.thiskeyword;

public class Point {
	
	int x;
	int y;
	public Point(int x,int y){
		
		this.x=x;
		this.y=y;
		
	}
	public void print() {
		
		System.out.println("x value:"+this.x +"\ny value: "+this.y);
		System.out.println(this);
		
	}
	public static void main(String[] args) {
		
		Point p=new Point(10,20);
		p.print();
		

	}

}
