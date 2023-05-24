//Factorial of any number is the product of an integer and all the integers below it 
//for example factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24.

package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int n, i;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		if (n==0)
		{
			System.out.println(n+"! = 1");
		}
		else
		{
		for (i=n-1; i>0; i--)
		{
			n=n*i;
		}
		System.out.println("Factorial= "+n);
		}
		sc.close();
	}
}
/* we can also use below method
for (i=1; i<=n; i++)
{
	n=n*i;
}
System.out.println("Factorial= "+n);
*/	