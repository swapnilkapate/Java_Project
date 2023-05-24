package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		 //Creating a list of fruits  
		  List<String> list1=new ArrayList<String>();  
		  
		  list1.add("Mango");  
		  list1.add("Apple");  
		  list1.add("Banana");  
		  list1.add("Grapes");  
		  
		  System.out.println(list1);
		  
		  //Sorting the list  
		  Collections.sort(list1);  
		  
		  System.out.println(list1);
		  
		  Collections.reverse(list1); // to print list in reverse order
		  
		  Collections.sort(list1,Collections.reverseOrder()); // to print list in reverse order
		  
		  System.out.println(list1);
		  
		 System.out.println("Sorting numbers...");  
		  //Creating a list of numbers  
		  List<Integer> list2=new ArrayList<Integer>();  
		  
		  list2.add(21);  
		  list2.add(11);  
		  list2.add(51);  
		  list2.add(1);  
		  //Sorting the list  
		  Collections.sort(list2);  
		   //Traversing list through the for-each loop  
		  for(Integer number:list2)  
		    System.out.println(number);
		  
		  System.out.println(list2);
		  System.out.println(list2.get(2));
		  
		 

	}

}
