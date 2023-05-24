//A Palindrome number is a number that remains the same when its digits are reversed. 
//Like 16461, for example: we take 121 and reverse it, after revers it is same as original number.

package programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int b, n, a=0, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		b = n;
		while(n>0)
		{
			r = n%10;
			a = a*10 + r;
			n = n/10;
		}
		if (a==b)
		{
			System.out.println("Palindrome number");
		}
		else
			System.out.println("Not Palindrome");
		
		//Other way
		System.out.println(checkPalindrome("1411"));
		sc.close();
	}
	
	public static boolean checkPalindrome(String s) {
		boolean result = true;
		int n = s.length();
		for (int i=0; i<n/2; i++) {
			if (s.charAt(i) != s.charAt(n-i-1)) {
				result = false;
				break;
			}
		}
		return result;
	}

}
