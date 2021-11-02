package com.sonata.packEg;

public class PackAirth {
	private int add (int a, int b) {
		return a+b;
	}
	int sub (int a, int b) {
		return a-b;
	}
	public int mul (int a, int b) {
		return a*b;
	}
	protected double div(double a, double b) {
		return a/b;
	}
	public static void main(String args[]) {
		PackAirth p1 = new PackAirth();
		
		System.out.println(p1.add(10, 20));
		System.out.println(p1.sub(10, 20));
		System.out.println(p1.mul(10, 20));
		System.out.println(p1.div(30, 20));
	}
}
