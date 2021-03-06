package com.bayviewglen.daytwo;

public class ExampleFour {

	public static void main(String[] args) {
		
		String[] words = {"Apple", "Pear", "Grape", "Almond"};
		
		int totalChars = getTotalCharacters(words);
		
		System.out.println("The total number of characters in array is: " + totalChars);
	}

	public static int getTotalCharacters(String[] words) {
		int totalChars = 0;
		
		for(String s : words){
			totalChars += s.length();
		}
		
		return totalChars;
	}
}

