package com.sonata;

public class Emp {
	int empId;
	String empName;
	double empSal;
	
//Constructor
	Emp(){};
	Emp(int a, String b, double c){
		this.empId= a;
		this.empName=b;
		this.empSal=c;
	}
	public double totalSal(double x, double y, double z) {
		return this.empSal+x+y+z;
	}
	
	public void displayInfo() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}
	
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.empId=111;
		e1.empName="Jon";
		e1.empSal=45670;
		e1.displayInfo();
		
		Emp e2 = new Emp(112,"Mark",32000);
		e2.displayInfo();
		System.out.println("The Total Salary Including TA, HRA and DA is: "+e2.totalSal(200, 250, 800));
	}
}
