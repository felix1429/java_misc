import java.util.*;

public class palindrome {
	
	static Scanner sc = new Scanner(System.in);
	static String scanInput;
	static Long counter;
	static String binaryLong;
	
	private static String isPalindrome(String input) {
		Integer strLength = input.length();
		String firstHalf;
		String secondHalf;
		String secondHalfReverse;
		
		if(strLength % 2 == 0) {
			firstHalf = input.substring(0, (strLength / 2));
			secondHalf = input.substring(strLength / 2);
			secondHalfReverse = new StringBuilder(secondHalf).reverse().toString();
		}else {
			firstHalf = input.substring(0, ((strLength - 1) / 2));
			secondHalf = input.substring(((strLength + 1) / 2));
			secondHalfReverse = new StringBuilder(secondHalf).reverse().toString();
		}
		
		//System.out.println(strLength);
		//System.out.println(firstHalf);
		//System.out.println(secondHalfReverse);
		
		if(firstHalf.equals(secondHalfReverse)) {
			return input;
		}else {
			return "n";
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Input a string");
		System.out.println(isPalindrome(sc.nextLine().toString()));
	}
}
