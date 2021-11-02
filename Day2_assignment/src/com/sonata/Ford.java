package com.sonata;

public class Ford extends Car {
	 int year;
	 int manufacturerDiscount;
	 Ford(){};
	 Ford(int speed,double Price,String color,int year,int manufacturerDiscount)
	 {
		 super(speed,Price,color);
		 this.year=year;
		 this.manufacturerDiscount=manufacturerDiscount;
	 }
	 double SalePrice() {
		 return Price-((Price*manufacturerDiscount)/100);
	 }
	 public void display() {
			super.display();
			System.out.println("Year : "+year);
			System.out.println("Manufacturer's Discount : "+manufacturerDiscount);
		}
}

