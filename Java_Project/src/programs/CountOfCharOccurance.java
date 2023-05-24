package programs;

import java.util.Scanner;

public class CountOfCharOccurance {

	public static void main(String[] args) {
		
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Enter a character to find:");
		char c = sc.next().charAt(0); // to take input character
		String p = Character.toString(c); // convert char to string
		
		int count =s.length() - s.replace(p, "").length();
		System.out.println("no of occ of "+c+":"+count); 

		
		/*//another way
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Enter a character to find:");
		char c = sc.next().charAt(0); // to take input character
		int a=0;
		for(int i=0; i<s.length(); i++)
		{
			if (s.charAt(i) ==c)
				a++;
		}
		System.out.println("no of occ of "+c+" is= "+a);
		*/
		sc.close();
	}

}
