package com.sonata1;

public class Ass_Q_8_9 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,5,5};
		int count= 0;
		System.out.println("Duplicate elements in array: ");		
		for(int i = 0;i < a.length;i++) {
			for(int j = i+1;j < a.length;j++) {
				if(a[i] == a[j]) {
			System.out.println(a[j]);
				count++;
				}
			}
			
		}
		System.out.println("There are: "+count+" Duplicate Numbers in Array");
	}

}
