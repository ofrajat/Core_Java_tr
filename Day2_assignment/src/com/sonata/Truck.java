package com.sonata;

public class Truck extends Car{
	int weight;
	Truck(){};
	Truck(int speed,double Price,String color,int weight)
	 {
		 super(speed,Price,color);
		 this.weight=weight;
	 }
	double SalePrice() {
		if(weight>2000)
			return Price-((Price*10)/100);
		return Price-((Price*20)/100);
	}
	public void display() {
		super.display();
		System.out.println("Weight : "+weight);
	}
	public static void main(String args[]) {
		Truck c1 = new Truck(200, 5000, "Red", 5000);
		System.out.print(c1.SalePrice());
	}
}
