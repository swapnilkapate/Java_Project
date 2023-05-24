package starprogram;

import java.util.Scanner;

public class Star11FilledInversePyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int b=n; b >= 1; b--) // 1st line
		{
			for (int a=n-1; a >= b; a--) // space
			{
				System.out.print(" ");
			}
			for (int a=1; a <= b; a++) // star
			{
				if (a==b)
				{
					System.out.print("*");
				}
				else System.out.print("**");
			}
			System.out.println();
		}
		sc.close();
	}

}
