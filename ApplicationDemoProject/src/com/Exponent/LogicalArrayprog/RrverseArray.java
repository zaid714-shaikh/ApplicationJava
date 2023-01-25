package com.Exponent.LogicalArrayprog;

import java.util.Iterator;

public class RrverseArray {

	public static void main(String[] args) {

		int a[] = { 121, 343, 23, 212, 43, 45,9 };
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("Reverse Array Is :- ");
		for (int i = a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("Maximum and minimum number from array:- ");
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println("max Number is : - " + max);
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println("Min number is :- " + min);
	}
	

}
