package com.boot.longest_word;

import java.util.ArrayList;
import java.util.List;
/**
 * Application which finds the longest words and its length!
 * Author: Mahesh Nair
 * GitHub: https://github.com/mashmn/
 */

public class LongestWordApp {
	
	public static void main (String args[]) {
		thePrinter();
		System.exit(0);	

	}
	
	// ArrayList with variety of sentences
	public static List<String> mySentences() {
		List<String> mySentence = new ArrayList<>();
		mySentence.add("Hi");
		mySentence.add("1234 is not a word!");
		mySentence.add("this words is a mistake jelly123bean.");
		return mySentence;
	}
	
	/** Method that splits sentences to smaller words 
	 *	finds the longest word and prints it out. 
	 */	 
	public List<String> longestWord(List<String> sentences) {
		
		List<String> resultOut = new ArrayList<>();
		
		for (String sentence: sentences) {
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
			resultOut.add(printOut);			
		}		
		return resultOut;
	}
	
	public static void thePrinter () {
		List<String> results = new LongestWordApp().longestWord(mySentences());

		for (String result: results) {
			System.out.println(result.toString());
		}

	}	
	
}