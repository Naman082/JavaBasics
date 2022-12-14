/*
Strings -> Count Number of words in the given String "str"

Sample Input 1:
Coding Ninjas
Sample Output 1:
2

Sample Input 2:

Sample Output 2:
0
*/

import java.util.Scanner;
public class CountWords {
	
	public static int CountWordsV1(String str) {
		int count = 1;
		String k= " ";
		if(str.length() == 0) { 
			return 0;
		}
		for(int i=0;i<str.length();i++) {
			String s = str.substring(i,i+1);
			if(s.equals(k)) {
				count++;
			}	
		}
		return count;	
	}
	
	public static int CountWordsV2(String str) {
		if(str.length() == 0) {
			return 0;
		}
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				++count;
			}
		}
		return count + 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = CountWordsV2(str);
		System.out.print(count);
	}

}
