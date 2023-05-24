package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n, a=0, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		while(n>0)
		{
			r = n%10;
			a = a*10 + r;
			n = n/10;
		}
		System.out.println("Reverse= "+a);
		sc.close();
	}

}
