package com.boot.longest_word;

import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

public class FailTest {
	
	public static ArrayList<String> myFakeSentences() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("We are cool when we are cool.");
		return words;
	}
	
	public static ArrayList<String> expectedOutput() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("There are more than 1 word with the same length.");
		return words;
	}
	
	/**
	 * Negative test case - MyApp does not 
	 * recognize sentence containing multiple words with same longest length.
	 */
   @Test
   public void LongestWordFailTest() {
	   LongestWordApp app = new LongestWordApp();
       assertNotEquals(app.longestWord(myFakeSentences()),expectedOutput());
   }
   
}
