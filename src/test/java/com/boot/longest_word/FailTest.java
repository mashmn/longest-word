package com.boot.longest_word;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
	
   @Test
   public void LongestWordFailTest() {
	   MyApp app = new MyApp();

       assertEquals(app.LongestWord(myFakeSentences()),expectedOutput());
   }
   
}
