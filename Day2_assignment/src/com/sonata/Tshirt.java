package com.sonata;

public class Tshirt {
	String Color;
	String Material;
	String Design;
	int Size;
	
	Tshirt(){
		System.out.println("Small-Sized Tshirts contain\n");
	};
	
	Tshirt(String color, String material, String design, int size){
		this.Color = color;
		this.Material = material;
		this.Design = design;
		this.Size = size;
		System.out.println("Medium-Sized-Tshirts contain\n");
	}
	
	Tshirt(String color, String material, String design){
		this.Color  = color;
		this.Material = material;
		this.Design = design;
		this.Size = 42;
		System.out.println("Large-Sized Tshirts contain\n");
	}

	public void display(){
		System.out.println("Color : "+Color);
		System.out.println("Material : "+Material);
		System.out.println("Design : "+Design);
		System.out.println("Size : "+Size+"\n");
	}

	public static void main(String[] args) {
		Tshirt Small = new Tshirt();
		Small.Color = "Black";
		Small.Material = "Cotton";
		Small.Design = "Formal";
		Small.Size = 25;
		Small.display();
		
		Tshirt Medium = new Tshirt("White","Cotton","Casual",30);
		Medium.display();
		
		Tshirt Large = new Tshirt("Red","Casual","Polo");
		Large.display();
		
	}

}
