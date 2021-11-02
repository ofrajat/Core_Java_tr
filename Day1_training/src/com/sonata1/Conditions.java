package com.sonata1;

public class Conditions {
	public static void main(String[] args) {  
		//For
		System.out.print("For Loop: ");  
	    for(int i=1;i<=5;i++){  
	        System.out.print(+i+" ");  
	    }
	    System.out.println('\n');  
	    
	    //If  
	    int x = 10;
	    if (x > 5) {
	      System.out.println("If Condition is true"+'\n');
	    }
	    
	  //Do While
	    System.out.print("Do While: ");  
	    int j=1;    
	    do{    
	        System.out.print(j+" ");    
	    j++;    
	    }while(j<=5);  
	
	    System.out.println('\n');  
	    
	  //Switch 
	    System.out.print("Switch Statement: ");  
	    int n=1;  
	    switch(n){  
	    case 1: System.out.println("10");  
	    break;  
	    case 2: System.out.println("20");  
	    break;  
	    case 3: System.out.println("30");  
	    break;  
	    default:System.out.println("Wrong input");  
	    }  
	 
	    System.out.print('\n');  
	    
	  //Break
	    System.out.print("Break Statement: ");  
	    for (int i = 0; i < 5; i++) {
	    	if (i == 2) {
	    		break;
	    	  }
	    	  System.out.print(i+" ");
	    }    
	}
}