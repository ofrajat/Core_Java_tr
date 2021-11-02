package com.sonata1;
import java.util.*;
public class Ass_Q6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str= sc.nextLine();
		String h[] = str.split("");
		String Vow[] = {"a","e","i","o","u"};
		for(int i=0;i<h.length;i++){
		
			for(int j=0;j<Vow.length;j++){
			if(h[i].equals(Vow[j])) {
				h[i]="$";
			}
		}
	}
		for(int j=0;j<h.length;j++){
		System.out.print(h[j]);
		}
		sc.close();
	}

}
