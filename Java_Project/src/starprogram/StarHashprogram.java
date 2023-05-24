package starprogram;

import java.util.Scanner;

public class StarHashprogram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<n; i++)
		{
			if (i==1)
			{
				System.out.println("*");
			}
			else
			{
				for (int j=0; j<=i;j++)
				{
					if (j==0 || j==i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("#");
					}
				}
				System.out.println();
			}
		}
		for (int j=0; j<n; j++)
		{
			System.out.print("*");
		}
		sc.close();
	}
}
