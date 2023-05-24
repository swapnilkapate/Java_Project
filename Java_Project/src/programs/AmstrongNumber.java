//Armstrong number is a number that is the sum of its own digits each raised to the 
//power of the number of digits is equal to the number itself.
//
//For example:
//Three Digits Armstrong number is 153, 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153
//Four Digits Armstrong number is 1634, 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634

package programs;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int a, n, r, s=0, p=0, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a = sc.nextInt();
		n = a;
		z = a;
		while (n>0)
		{
			n = n/10;
			p = p+1;
		}
		System.out.println(p); //to find total no of digits in number
		while (a>0)
		{
			r = a%10;
			a = a/10;
			s = (int) (s + Math.pow(r, p));
		}
		if (s==z)
		{
			System.out.println("Amstrong Number");
		}
		else 
		{ 
			System.out.println("Non Amstrong number");
		} 		
		sc.close();
	}
}
