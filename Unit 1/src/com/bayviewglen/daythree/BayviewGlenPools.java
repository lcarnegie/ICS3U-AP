package com.bayviewglen.daythree;

public class BayviewGlenPools {

	public static void main(String[] args) {
		//Variables, measurements all in metres. 
		int lengthPool = 40; 
		int widthPool = 20;
		int depthDeep = 3; 
		int depthShallow = 1; 
		int lengthTransition = 4; 
		int lengthShallow = 30;
		double lengthDeep = lengthPool - lengthShallow - (Math.sqrt(Math.pow(lengthTransition, 2) - Math.pow((depthDeep - depthShallow), 2)));
		double priceOfLiner = 0.5; //Per metre squared
		
		double volumeTransition = (0.5 * widthPool * (0.5 * (depthDeep - depthShallow) * Math.sqrt(Math.pow(lengthTransition, 2) - Math.pow((depthDeep - depthShallow), 2))));
		
		double volumeOfPool = (lengthPool * widthPool * depthShallow) + (lengthDeep * widthPool * (depthDeep - depthShallow) + volumeTransition);
		
		//Pool Volume
		System.out.println("The volume of water needed to fill this pool to 90% capacity is " + (volumeOfPool * 0.9) + " litres.");
		
		double surfaceArea = (widthPool * depthDeep) + (widthPool * lengthDeep) + (widthPool * lengthTransition) + (widthPool * lengthShallow) + (widthPool * depthShallow) + (2 * lengthDeep * depthDeep) + (2 * lengthShallow * depthShallow) + (2 * ((Math.sqrt(Math.pow(lengthTransition, 2) - Math.pow((depthDeep - depthShallow), 2)))) * depthShallow) + (2 * (depthDeep - depthShallow) * (Math.sqrt(Math.pow(lengthTransition, 2) - Math.pow((depthDeep - depthShallow), 2)))); 
	
		System.out.println("You will need: " + surfaceArea + " square metres of pool liner to line your pool. \nIf pool liner costs " + priceOfLiner + " dollars per metre squared, then it will cost: " + (surfaceArea * 0.5) + " dollars to line your pool with the sufficient amount of liner.");
		
	}

}
