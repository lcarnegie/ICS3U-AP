package com.bayviewglen.dayone;

public class ThinkingCap {
	
	//variables define the state of the object
	private String redWords; //the variable is private so that anyone can't access the vars of the Object directly. 
									//make sure that your object is used how it should be
	private String greenWords;
	
	/*
	 * If you do not create a constructor Java will supply
	 * you with one that does NOTHING!!!
	 * The one it supplies takes no arguments
	 */
	
	//default or no argument constructor
	public ThinkingCap() {
		redWords = "";
		greenWords = ""; 
	}
	public ThinkingCap(String greenWords, String redWords) {
		this.redWords = redWords; // "this" means that in that instance of the object the instance variables equal the input values
		this.greenWords = greenWords; //this can also be used to return an object by jsut putting in return this; 
	}
	//methods define the behavior of the object
	public String pushRed() {
		return redWords; 
	}
	
	public void insertRed(String redMsg) {
		redWords = redMsg; 
	}
	
	public String pushGreen() {
		return greenWords; 
	}
	
	public void insertGreen(String greenMsg) {
		greenWords = greenMsg; 
	}
}
