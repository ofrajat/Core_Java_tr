package com.sonata;

public class SavingAcc extends Bank {
	SavingAcc(){};
	SavingAcc(int a, String b, double c){
		super(a, b, c);
	}
	public static void main(String args[]) {
		SavingAcc a1 = new SavingAcc();
		a1.accNo=11;
		a1.accName="Third";
		a1.accBal=200.67;
		a1.display();
		
		SavingAcc a2 = new SavingAcc(22,"Fourth",500);
		a2.display();
	}

}
