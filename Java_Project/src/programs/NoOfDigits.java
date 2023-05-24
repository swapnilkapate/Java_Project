package programs;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		
		long a;
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a = sc.nextLong();
	
		 if(a==0)
		{
			a=1;
		}
		while(a>0 || a<0)
		{
			a = a/10;
			n++;
		}		
		System.out.println("Number of digits in given number = "+n);
		sc.close();

/* we can also run this program by using below 2 methods;
1.Method
if(a<0)
{
	a = a* -1;
}
else if(a==0)
{
	a=1;
}
while(a>0)
{
	a = a/10;
	n++;
}
System.out.println("Number of digits in given number = "+n);*/

/* 2.Method	
do
{
	a = a/10;
	n++;
}while(a>0 || a<0);

System.out.println("Number of digits in given number = "+n);*/

	}

}
