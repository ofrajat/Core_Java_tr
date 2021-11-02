package com.sonata;

public class Sedan extends Car {
	 int length;
	 Sedan(){};
	 Sedan(int speed,double Price,String color,int length)
	 {
		 super(speed,Price,color);
		 this.length=length;
	 }
	 double SalePrice() {
		 super.SalePrice();
		 if(length>20)
			 return Price-((Price*5)/100);
		 return Price-((Price*10)/100);
	 }
	 public void display() {
			super.display();
			System.out.println("Length : "+length);
		}

}
