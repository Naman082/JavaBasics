/*
SAMPLE INPUT:
Always indent your code
SAMPLE OUTPUT:
code your indent Always
*/

import java.util.Scanner;
public class ReverseStringWordWise {
	
	private static String reverseWordWise(String str) {
		String ans = "";
		int end = str.length()-1, i;
		for(i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==' ') { // Whenever we encounter a space that means a word ends & another word starts
				int start = i+1;
				String newWord = "";
				for(int j=start;j<=end;j++) {
					newWord += str.charAt(j);
				}
				ans += newWord + " ";
				end = i-1;
			}
		}
		int start = i+1;
		String newWord = "";
		for(int j=start;j<=end;j++) {
			newWord += str.charAt(j);
		}
		ans += newWord + " ";
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(reverseWordWise(str));
	}
}
