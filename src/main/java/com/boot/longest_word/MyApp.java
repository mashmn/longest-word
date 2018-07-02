package com.boot.longest_word;

import java.util.ArrayList;
/**
 * Application which finds the longest words and its length!
 * Author: Mahesh Nair
 * GitHub: https://github.com/mashmn/
 */

public class MyApp {
	
	public static void main (String args[]) {
		new MyApp().LongestWord();
		System.exit(0);	

	}
	
	// ArrayList with variety of sentences
	public static ArrayList<String> mySentences() {
		ArrayList<String> mySentence = new ArrayList<String>();
		mySentence.add("Hi");
		mySentence.add("1234 is not a word!");
		mySentence.add("this words is a mistake jelly123bean.");
		return mySentence;
	}
	
	/** Method that splits sentences to smaller words 
	 *	finds the longest word and prints it out. 
	 */	 
	public void LongestWord() {
		
		ArrayList<String> str = mySentences();; 
		
		for (String sentence: str) {
			String[] words = sentence.split("\\s*[^a-zA-Z]+\\s*");
			
			int longestStringLength = 0;
			String longestWord = "";

			for (String word: words) {
				
				if (longestStringLength < word.length()) {
					longestStringLength = word.length();
					longestWord = word;
				}
				
			}
			String printOut = "In the sentence \"" + sentence +"\" -----> Longest word: \"" + longestWord + "\" and length: " + longestStringLength + ".";
			System.out.println(printOut);			
		}
	}
	
	
}