package java_pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Swapnil");
		a1.add("Vishal");
		a1.add("Ganesh");
		System.out.println(a1);
		
		System.out.println("2nd element: "+a1.get(1));
		
		List<String> a2 = new ArrayList<String>();
		System.out.println("Enter name : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		System.out.println("Enter name : ");
		String b = sc.nextLine();
		
		a2.add(a);
		a2.add(b);
		
		System.out.println(a2);
		
		a1.addAll(a2);
		a1.sort(null);
		System.out.println(a1);
		sc.close();
	}

}
