package programs;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();  // The nextLine() method of Scanner class is used to take a string from the user.
		
		String output ="";
		
		for (int i = input.length()-1; i >=0; i--) // input.length() is used to get length of string
		{
			output = output  + input.charAt(i); // input.charAt(i) is used to get character at ith position in string.
		} 
			System.out.println(output);
		
		/* 2nd way
		char[] c = input.toCharArray();
		
		for (int j = c.length-1; j >= 0; j--)
		{
			System.out.print(c[j]);
		}
		*/
		/* 3rd way	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		
		StringBuffer s = new StringBuffer(a);
		System.out.println(s.reverse());*/
			sc.close();
	}

}
