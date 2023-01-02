/*
String -> Check Permutation of the given String "str" 

SAMPLE INPUT 1:
abcde
dcbea
SAMPLE OUTPUT 2:
true

SAMPLE INPUT 1:
blgh
ghbt
SAMPLE OUTPUT 2:
false

*/

import java.util.Scanner;
public class CheckPermutation {
	
	private static boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		int[] frequency = new int[256]; // length of ASCII 
		for(int i=0;i<256;i++) { // Not strictly necessary as frequency array is of type integer so the default values are 0's
			frequency[i] = 0;
		}
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			++frequency[ch]; // frequency[ch]++; 
		}
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			--frequency[ch]; // frequency[ch]--;
		}
		for(int i=0;i<256;i++) {
			if(frequency[i] != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		System.out.print(isPermutation(str1, str2));
	}
}
