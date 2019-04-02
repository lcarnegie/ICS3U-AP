package com.bayviewglen.daythree;

public class HiddenWord {
	private String theWord;

	public HiddenWord(String word) {
		theWord = word;
	}

	public String getHint(String guess) {
		String hint = "";
		for (int i = 0; i < theWord.length(); i++) {
			String letter = theWord.substring(i, i + 1);
			if (guess.substring(i, i + 1).equals(letter)) {
				hint += letter;
			} else if (theWord.indexOf(guess.substring(i, i + 1)) >= 0) {
				hint += "+";
			} else {
				hint += "*";
			}
		}
		return hint;
	}
}
