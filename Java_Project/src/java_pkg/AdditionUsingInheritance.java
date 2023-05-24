package java_pkg;

import java.util.Scanner;

class AddData {
	
	int num1, num2;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		sc.close();
	}
}

class Addition extends AddData {

	int sum;

	public void add() {
		sum = num1 + num2;
	}

	void display()
    {
       System.out.println("Addition of two numbers = "+sum);
    }
}

public class AdditionUsingInheritance {

	public static void main(String[] args) {

		Addition a = new Addition();
		a.accept();
		a.add();
		a.display();
		
	}

}
