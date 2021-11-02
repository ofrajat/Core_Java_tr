package com.sonata;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan s1 = new Sedan(120,170000,"Blue",20);
		s1.display();
		System.out.println("Sale Price : "+s1.SalePrice());
		System.out.println();
		
		Ford f1 = new Ford(170,420000,"Black",2000,10);
		f1.display();
		System.out.println("Sale Price : "+f1.SalePrice());
		System.out.println();
		
		Ford f2 = new Ford(200,270000,"Grey",2015,20);
		f2.display();
		System.out.println("Sale Price : "+f2.SalePrice());
		System.out.println();
		
		Car c1 = new Car(130,120000,"White");
		c1.display();
		System.out.println("Sale Price : "+c1.SalePrice());
		System.out.println();
		

	}
}
