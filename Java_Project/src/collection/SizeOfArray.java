package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SizeOfArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>(10);  
		al.add(95);
		al.add(45);
	      
	    System.out.println("The size of the array is: " + al.size());
	    
	    System.out.println("Enter list count :");
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    
	    for (int i=0; i<a; i++)
	    {
	    	System.out.println("Enter values :");
	    	int b = sc.nextInt();
	    	al.add(b);
	    }
	    System.out.println("Size of array : "+al.size());
	    System.out.println(al);
	    sc.close();
	}

}
