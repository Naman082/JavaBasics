/*
SAMPLE INPUT 1:
abcda
SAMPLE OUTPUT 1:
a

SAMPLE INPUT 2:
ab
SAMPLE OUTPUT 2:
a

*/

import java.util.Scanner;
public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
		int[] frequency = new int[256]; // initializing an freq array of size 256 which will store 0's by default
		int maxFreq = 0;
        
		for(int i=0;i<str.length();i++) {
			++frequency[str.charAt(i)];
			maxFreq = Math.max(maxFreq, frequency[str.charAt(i)]); // figuring out the max freq
		}
        
		char ans = '\0';
		for(int i=0;i<str.length();i++) {
			if(frequency[str.charAt(i)] == maxFreq) { // comparing freq of character with max freq
				ans = str.charAt(i);
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(highestOccuringChar(str));
	}
}
