package com.sonata;

public class Student {
	int stuId;
	String stuName;
	String stuClass;
	
//Constructor
	Student(){};
	Student(int a, String b, String c){
		this.stuId= a;
		this.stuName=b;
		this.stuClass=c;
	}
	public void displayInfo() {
		System.out.println(stuId);
		System.out.println(stuName);
		System.out.println(stuClass);
	}
	public static void main(String[] args) {
		Student e1 = new Student();
		e1.stuId=111;
		e1.stuName="Jon";
		e1.stuClass="11th";
		e1.displayInfo();
		
		Student e2 = new Student(112,"Mark","10th");
		e2.displayInfo();
}
}