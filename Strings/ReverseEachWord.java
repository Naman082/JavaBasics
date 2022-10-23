/*
String -> Reverse each word in the String "str"

Sample Input 1:
abc def ghi
Sample Output 1:
cba fed ihg

Sample Input 2:
kbst
Sample Output 2:
tsbk
*/

import java.util.Scanner;

public class ReverseEachWord {
	
	public static String revEachWord(String str) {
		String ans = "";
		int currWordStart=0, i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				//Reverse each word
				int currWordEnd = i-1;
				String revWord = "";
				for(int j=currWordStart;j<=currWordEnd;j++) {
					revWord = str.charAt(j) + revWord;
				}
				//Add it to final ans
				ans += revWord + " ";
				currWordStart = i+1;
			}
		}
		int currWordEnd = i-1;
		String revWord = "";
		for(int j=currWordStart;j<=currWordEnd;j++) {
			revWord = str.charAt(j) + revWord;
		}
		// Add to final String ans
		ans += revWord;
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(revEachWord(str));
	}

}
