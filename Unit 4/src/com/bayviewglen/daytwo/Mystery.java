package com.bayviewglen.daytwo;

public class Mystery {
	
	public int x;
	
	public Mystery(){ // constructor - when a new "mystery" object is created, it goes to the constructor 
		x = 5;
	}
	
	public void updateX(){
		x++;
	}
	
	public String toString(){
		return x + "";
	}
	
}

