package com.boot.longest_word;

/**
 * Application which finds the longest words and its length!
 * Author: Mahesh Nair
 * GitHub: https://github.com/mashmn/
 */
import java.util.Scanner;

public class MyApp {
	
	public static void main (String args[])  {

		System.out.println("Type a sentence:");	
		ScanSentence();
		System.exit(0);
	}
	
	public static void ScanSentence() {
		Scanner scan = new Scanner(System.in);
		System.out.println();		
		System.out.println(LongestWord(scan.nextLine()));
		scan.close();		
	}
	
	public static String LongestWord(String str) {
		
// 		Added regular expression to consider legible words consisting of alphabets only.
//		String[] words = str.split("\\s*[^a-zA-Z0-9]+\\s*");
		String[] words = str.split("\\s*[^a-zA-Z]+\\s*");
		
		int longestStringLength = 0;
		String longestWord = "";

		for (String word: words) {
			
			if (longestStringLength < word.length()) {
				longestStringLength = word.length();
				longestWord = word;
			}
		}
		
		return ("The longest word is \"" + longestWord + "\" and the length is " + longestStringLength + ".");
	}
	
}