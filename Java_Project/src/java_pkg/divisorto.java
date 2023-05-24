package java_pkg;

import java.util.Scanner;

public class divisorto {

	public void m() {
		System.out.println("Method1 executed");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for (int i=1; i<n; i++) {
			for (int m=2; m<=n; m++) {
				if(n%m==0) {
					n=n/m;
					k=k+1;
					System.out.println(n);
					break;	
				}	
			}
		}
		System.out.println("No. of operations = "+k);
		divisorto obj = new divisorto();
		obj.m();
		sc.close();
	}

}
