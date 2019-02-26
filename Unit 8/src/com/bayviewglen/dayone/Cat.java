package com.bayviewglen.dayone;

public class Cat extends Animal {
	public Cat(String name) {
		setName(name); 
		updateWeight(10); 
	}

	
	public void makeNoise() {
		System.out.println("Miaow!");
	}

	
	public void play() {
		System.out.println("Scratch Sally");
		updateWeight(-2); 
		
	}

}
