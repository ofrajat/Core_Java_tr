package com.sonata;

public class Manager extends Emp{
	Manager(){};
	Manager(int a, String b, double c){
		super(a, b, c);
	}
	public static void main(String args[]) {
		Manager m1 = new Manager();
		m1.empId=11;
		m1.empName="Habibi";
		m1.empSal=200.67;
		m1.displayInfo();
		
		Manager a2 = new Manager(22,"Walla",500);
		a2.displayInfo();
		System.out.println(a2.totalSal(100, 200, 200));
	}

}
