package programs;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int count = 1;
		
		for (int i = 0; i < s.length()-1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
			{
				count++;
			}
		}
		System.out.println("No of words in a string="+count);
		sc.close();
	}

}
