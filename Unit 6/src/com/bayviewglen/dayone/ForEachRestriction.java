package com.bayviewglen.dayone;

import java.util.ArrayList;

/* Cannot change the size of the collection you are iterating through
 * in a for each loop
 */
public class ForEachRestriction {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ints.add(i);
		}
		System.out.println(ints);

		// the index and element are the same for this example
		for (Integer i : ints) {
			if (i == 4)
				ints.add(i, i);	// adds 4 at index 4 - crash
		}

		// the index and element are the same for this example
		for (Integer i : ints) {
			if (i == 4)
				ints.remove(i); //  crash
		}
		
	}

}

