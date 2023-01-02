/*
SAMPLE INPUT:
aabbbccdsa
SAMPLE OUTPUT:
a2b3c2dsa

*/

import java.util.Scanner;

public class CompressString {
	
	public static String compressString(String str) {
		String ans = "";
		char ch = str.charAt(0);
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}else {
				ans += ch; // add character to ans String
				if(count > 1) { // if count is greater than 1 then add count after character: "aaa" -> "a3"
					ans += count;
					count = 1;
				}
				ch = str.charAt(i); // store the new character(character at index i) in ch
			}
			if(i == str.length()-1) { // i is at the last index of String str
				ans += str.charAt(i);
				if(count > 1)
					ans += count;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(compressString(str));
	}

}
