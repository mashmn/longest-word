package com.boot.longest_word;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class LongestWordTest {
	
	public static ArrayList<String> myFakeSentences() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Wait a minute?!");
		words.add("Whats up?");
		words.add("Chicken looks li33333ke turkey.");
		words.add("Pork looks like😤 turkey.");
		return words;
	}
	
	public static ArrayList<String> expectedOutput() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("In the sentence \"Wait a minute?!\" -----> Longest word: \"minute\" and length: 6.");
		words.add("In the sentence \"Whats up?\" -----> Longest word: \"Whats\" and length: 5.");
		words.add("In the sentence \"Chicken looks li33333ke turkey.\" -----> Longest word: \"Chicken\" and length: 7.");
		words.add("In the sentence \"Pork looks like😤 turkey.\" -----> Longest word: \"turkey\" and length: 6.");
		return words;
	}
	
	/**
	 * 
	 */
   @Test
   public void LongestWordMethodTest() {
	   MyApp app = new MyApp();

       assertEquals(app.LongestWord(myFakeSentences()),expectedOutput());
   }
   
}
