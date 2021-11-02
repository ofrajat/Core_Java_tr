package com.sonata1;

public class Ass_10 {

	public static void main(String[] args) {
		int a[] = { 12, 25, 89, 82, 50, 44, 91 };
	    int largest = a[0];
	    int secondLargest = a[0];
	    
	    System.out.println("The given array is:" );
	    for (int i = 0; i < a.length; i++) {
	      System.out.print(a[i]+"\t");
	    }
	    for (int i = 0; i < a.length; i++) {
	 
	      if (a[i] > largest) {
	        secondLargest = largest;
	        largest = a[i];
	 
	      } else if (a[i] > secondLargest) {
	        secondLargest = a[i];
	 
	      }
	    }
	 
	    System.out.println("\nLargest: "+largest+"\nSecond largest: " + secondLargest);
	 
	  }

	}


