package com.bayviewglen.dayone;

public abstract class Animal {
	private int weight;  
	private String name; 
	
	//Abstract = unfinished class -> people cannot construct them ie. you cannot say new Animal(); 
	public Animal() {
		
	}
	public abstract void makeNoise(); 
	public abstract void play(); 
	
	public void eat(int amount) {
		this.updateWeight(amount / 3); 
	}
	public int updateWeight(int delta) {
		return weight += delta; 
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
