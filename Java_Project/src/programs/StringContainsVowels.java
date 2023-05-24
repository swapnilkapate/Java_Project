package programs;

import java.util.Scanner;

public class StringContainsVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		if(str.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		sc.close();
	}
}
