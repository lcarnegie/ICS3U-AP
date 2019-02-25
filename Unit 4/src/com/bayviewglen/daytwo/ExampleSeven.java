package com.bayviewglen.daytwo;

public class ExampleSeven {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 6, 10, -2, 11};
		
		for(int i : arr){
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i : arr){
			i++;
		}
		
		for(int i : arr){
			System.out.println(i);
		}	
		
		/*
		
		String[] arr = {"Apple", "Pear", "Grape", "Almond"};
		
		for(String i : arr){
			System.out.println(i);
		}
		
		System.out.println();
		
		int i = 0; 
		for(String el : arr){
			el = el.substring(0, 2);
			System.out.println(el);
			System.out.println(arr[i]);
			i++; 
			
		}
		
		System.out.println();
		
		for(String j : arr){
			System.out.println(j);
		}	
		 */ 
	}
}


