package com.sonata;

public class Car {
	int speed;
	double Price;
	String color;
	Car(){};
	Car(int speed,double Price,String color)
	{
		this.speed=speed;
		this.Price=Price;
		this.color=color;
	}
	double SalePrice() {
		return Price;
	}
	public void display() {
		System.out.println("Speed : "+speed);
		System.out.println("Base Price : "+Price);
		System.out.println("Color : "+color);


	}

}
