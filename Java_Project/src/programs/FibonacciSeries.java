//Fibonacci series is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,…… 
//To find this series we add two previous terms/digits and get next term/number.

package programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a, first=0, second=1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		a = sc.nextInt();
		
		for (int i=0; i<a; i++)
		{
			System.out.println(first);
			n = first + second;
			first = second;
			second = n;
		}
		sc.close();
	}

}
