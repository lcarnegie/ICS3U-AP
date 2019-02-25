package com.bayviewglen.assignment;

public class AddAfter {

	public static void main(String[] args) {
		if(currentIndex != manyItems) { // adds after curr element
			if(manyItems + 1 > data.length) {
				int nLength = 2 * data.length; 
				double[] nData = new double[nLength]; 
				int i; 
				for(i = 0; i <= currentIndex; i++) { //copies everything until where new thing has to go
					nData[i] = data[i]; 
				}
				nData[i] = d; // adds the thing
				manyItems++; 
				currentIndex = i; 
				i++; 
				for(int j = i; j < manyItems; j++) {
					nData[j] = data[j - 1]; //does the rest of the old array
				}
				data = nData; 
			}
			
			double[] nData = new double[data.length]; 
			int i; 
			for(i = 0; i <= currentIndex; i++) { //copies everything until where new thing has to go
				nData[i] = data[i]; 
			}

			manyItems++; 
			currentIndex = i; 
			i++; 
			for(int j = i; j < manyItems; j++) {
				nData[j] = data[j - 1]; //does the rest of the old array
			}
			data = nData; 
		}
		else { //adds at the end
			if(currentIndex != manyItems - 1) { // adds after curr element
				if(manyItems + 1 > data.length) {
					int nLength = 2 * data.length; 
					double[] nData = new double[nLength]; 
					int i; 
					for(i = 0; i <= data.length; i++) { //copies everything until where new thing has to go
						nData[i] = data[i]; 
					}
					nData[i] = d; 
					manyItems++; 
					currentIndex = i; 
					data = nData; 
					 
				}
				double[] nData = new double[data.length]; 
				int i; 
				for(i = 0; i < data.length; i++) {
					nData[i] = data[i]; 
				}
				nData[i] = d; 
				manyItems++; 
				currentIndex = i;
				data = nData;
		}
		}
		
		

	}

}
