package com.bayviewglen.dayone;

public class Dog extends Animal {
	
	public Dog(String name) {
		setName(name); 
		updateWeight(10); 
	}

	
	public void makeNoise() {
		System.out.println("Woof!! Woof!!!");
	}

	
	public void play() {
		System.out.println("Yelp!!!");
		updateWeight(-2); 
		
	}

}
