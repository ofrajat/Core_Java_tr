package com.sonata;

public class Student {
	int stuId;
	String stuName;
	double stuMarks;
	
//Constructor
	Student(){};
	Student(int a, String b, double c){
		this.stuId= a;
		this.stuName=b;
		this.stuMarks=c;
	}
	public double totalMarks(double p, double c, double m) {
			return this.stuMarks+p+c+m;
	}
	
	public void displayInfo() {
		System.out.println(stuId);
		System.out.println(stuName);
		System.out.println(stuMarks);
	}
	
	public static void main(String[] args) {
		Student e1 = new Student();
		e1.stuId=111;
		e1.stuName="Jon";
		e1.stuMarks=50;
		e1.displayInfo();
		
		Student e2 = new Student(112,"Mark",40);
		e2.displayInfo();
		System.out.println("The Total Marks are: "+e2.totalMarks(20, 25, 80));
	}
}
