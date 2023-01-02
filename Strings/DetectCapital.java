/*
Given a String, return true if the usage of capital in it is correct.
Ex. "UK", "going", "Mango" are all correct
EX. "HapPy", "THis" are incorrect.

SAMPLE INPUT 1:
Varun
SAMPLE OUTPUT 1:
true

SAMPLE INPUT 2:
THEadore
SMPLE OUTPUT 2:
false
*/

import java.util.Scanner;
public class DetectCapital {
	
	private static boolean detectCapitalUse(String word) {
		int capital = 0, small = 0;
		for(int i=0; i<word.length();i++) {
			if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') 
				capital++;
			else
				small++;
		}
		if(capital == word.length() || small == word.length())
			return true;
		else if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && small == word.length()-1)
			return true;
		else
			return false;		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(detectCapitalUse(s.next()));
	}	
}
