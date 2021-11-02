package com.sonata;

public class Product {
	int ProId;
	String ProName;
	double ProPrice;
	
	Product(){};
	Product(int a, String b, double c){
		this.ProId= a;
		this.ProName=b;
		this.ProPrice=c;
	}
	public double totalPrice(double p) {
		return this.ProPrice+p;
	}
	public void display() {
		System.out.println(ProId);
		System.out.println(ProName);
		System.out.println(ProPrice);
	}
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.ProId=111;
		p1.ProName="Light";
		p1.ProPrice=150;
		p1.display();
		
		Product p2 = new Product(112,"Fan",100);
		p2.display();
		System.out.println("The Total Price is: "+p2.totalPrice(18));
	}
}
