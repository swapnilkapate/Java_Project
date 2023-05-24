package starprogram;

import java.util.Scanner;

public class Star9SideInversePyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int b=1; b <= n; b++) // 1st line
		{
			for (int a=n-1; a >= b; a--) // star
			{
				System.out.print(" ");
			}
			for (int a=1; a <= b; a++) // star
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int b=n-1; b >= 1; b--) // 1st line
		{
			for (int a=n-1; a >= b; a--) // space
			{
				System.out.print(" ");
			}
			for (int a=1; a <= b; a++) // star
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
