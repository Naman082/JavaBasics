/*
String -> Reverse the given String "str"

Sample Input 1:
coding
Sample Output 1:
gnidoc

Sample Input 2:
a
Sample Output 2:
a
*/
import java.util.Scanner;

public class ReverseString {
	
	public static String RevStringV1(String str) {
		String revStr = "";
		for(int i= str.length()-1;i>=0;i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
	
	public static String RevStringV2(String str) {
		String revStr = "";
		for(int i=0;i<str.length();i++) {
			revStr = str.charAt(i)+ revStr;
		}
		return revStr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(RevStringV1(str));
	}

}
