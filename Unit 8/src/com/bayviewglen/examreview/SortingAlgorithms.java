package com.bayviewglen.examreview;

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] sorter = {5,10,54,23,14,56,45,67}; 
		for(int i = 0; i < sorter.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < sorter.length; j++) {
				if(sorter[j] < sorter[minIndex]) {
					minIndex = j;
				}
			}
			int temp = sorter[i];
			sorter[i] = sorter[minIndex];
			sorter[minIndex] = temp; 

		}

	}

}
