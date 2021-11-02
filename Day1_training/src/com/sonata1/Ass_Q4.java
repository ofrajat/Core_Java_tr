package com.sonata1;
import java.util.*;

public class Ass_Q4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);	
		System.out.print("Enter the Number to Search: ");
		int b = sc.nextInt();
		boolean test = false;
		int a[] = {1,2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++){  
			if(a[i] == b) {
				test= true;
				break;
	    }   
	  }
		if(test) {
		System.out.println(b+ " Found");  
 }else {
	 System.out.println("Number not found");
 }
		sc.close();
}
}