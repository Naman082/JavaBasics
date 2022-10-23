/*
String -> Check Permutation of the given String "str" 

Sample Input 1:
naman
Sample Output 2:
true

Sample Input 1:
bakrewal
Sample Output 2:
false

*/

import java.util.Scanner;

public class CheckPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		int[] frequency = new int[256];// length of ASCII 
		for(int i=0;i<256;i++) {
			frequency[i] = 0;
		}
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			++frequency[ch];
		}
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			--frequency[ch];
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
