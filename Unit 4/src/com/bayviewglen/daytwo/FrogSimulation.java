package com.bayviewglen.daytwo;
// 2018 AP COMP SCI EXAM FREE-RESPONSE QUESTION NO 1 
// ITS NOT AS HARD AS YOU THINK!!!!! :)
public class FrogSimulation {
	private int goalDistance; 
	private int maxHops; 
	
	public boolean simulate() {
		int currentDistance = 0; 
		
		for ( int i = 0; i < maxHops; i++) {
			int currentHop = hopDistance(); 
			currentDistance += currentHop; 
			if(currentDistance >= goalDistance)
				return true; 
		}
		return false; 
		
	}

	private int hopDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double runSimulations(int num) {
		int numSuccess = 0; 
		
		for (int i = 0; i < nums; i++) {
			if(simulate()) 
				numSuccess++; 
			
		}
		return (double) numSuccess / num; //percentage of how many times the simulation is successful
	}
}
