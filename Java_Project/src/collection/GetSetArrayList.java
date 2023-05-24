package collection;

import java.util.ArrayList;

public class GetSetArrayList {

	public static void main(String[] args) {
		
		  ArrayList<String> al = new ArrayList<String>();  
		
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  System.out.println(al);
		  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  
		  //changing the element  
		  al.set(1,"Dates");  
		  
		  //Traversing list  
		  for(String fruit:al)    
		  System.out.println(fruit);
		  
		  System.out.println(al);
	}

}
