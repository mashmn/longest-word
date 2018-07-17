# longest-word

## How to Setup and Run
- Download binary zip archive for [maven](https://maven.apache.org/download.cgi)
- Add maven to System variables and check maven version
	
	`mvn -version`
	 
- Clone the project 

	`git clone https://github.com/mashmn/longest-word.git`
	
- Install all dependencies

	`mvn install`
	
- To Run the application which finds the longest word, run LongestWordApp.java -> Run as Java Application.

- To Run the test cases, run the test suite AllTests.java -> Run as JUnit Test 
	or run
	
	`mvn test`

---

### Things to notice in the Test Cases:
There are two 2 test cases:
1. LongestWordTest.java -> to test sentence with unicode, alphanumeric and other non alphabets.
2. FailTest.java -> Negative test case - LongestWordApp does not recognize sentence containing multiple words with same longest length.


Thank you :)