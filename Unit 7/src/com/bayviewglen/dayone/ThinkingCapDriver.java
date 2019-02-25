package com.bayviewglen.dayone;

public class ThinkingCapDriver {

	public static void main(String[] args) {
		ThinkingCap cap1 = new ThinkingCap();
		//when you want an instance of the class
		//you call the constructor. new constructor(); 
		// the constructor is just a method with the same name
		//as the class. 
		ThinkingCap cap2 = new ThinkingCap(); 
		
		cap1.insertGreen("I like Green");
		cap2.insertGreen("I don't like Green");
		
		cap1.insertRed("I like Red");
		cap2.insertRed("I don't like Red");
		
		System.out.println(cap1.pushGreen());
		System.out.println(cap2.pushGreen());
		
		System.out.println(cap1.pushRed());
		System.out.println(cap2.pushRed());

	}

}
