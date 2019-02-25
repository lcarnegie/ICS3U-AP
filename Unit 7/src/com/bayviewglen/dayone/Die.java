package com.bayviewglen.dayone;

public class Die {
	private int numSides; 
	private int topSide; 
	
	public Die() {
		numSides = 6; 
		roll(); 
	}
	
	public Die(int numSides){
		this.numSides = numSides; 
	}
	
	public void roll(){
		topSide = (int)(Math.random()*numSides) + 1; 
 	}

	public int getTopSide() {
		return topSide;
	}
	
	public boolean equals(Die die) {
		return this.topSide == die.topSide; 
	}
	
}
