package com.bayviewglen.examreview;

import java.util.ArrayList; 
public class ArrList {
	public static void Main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(); 
		words.add("hard");
		words.add("work"); 
		words.add("pays");
		words.add("off"); 
		
		words.add(words.get(3)); 
		System.out.println(words);
	
	}
}
