package com.sonata;

public class Bank {
	int accNo;
	String accName;
	double accBal;
	
//Constructor
	Bank(){};
	Bank(int a, String b, double c){
		this.accNo= a;
		this.accName=b;
		this.accBal=c;
	}
	
	public double deposit(){
		return accBal= accBal + 10;
	}
	public double withdraw(){
		return accBal= accBal - 10;
	}
	public void display() {
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBal);
	}
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.accNo=1;
		b1.accName="First";
		b1.accBal=4567.00;
		b1.display();
		
		Bank b2 = new Bank(2,"Second",3200);
		b2.display();
		b2.deposit();
	}
}
