package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int no, i;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		no = sc.nextInt();
		if (no==1)
		{
			System.out.println("Smallest prime no is 2");
		}
		for (i=2; i< no; i++)
		{
			if(no%i==0)
			{
				System.out.println("Non-Prime number");
				break;
			}
		}
		if (no==i)
		{
			System.out.println("Prime number");
		}
		
	}

}
