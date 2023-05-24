package collection;

import java.util.ArrayList;

public class AddElementsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();  
        System.out.println("Initial list of elements: "+al);  
         
        al.add("Ravi");  //Adding elements to the end of the list 
        al.add("Vijay");  
        al.add("Ajay");  
        System.out.println("After invoking add(E e) method: "+al);  
        
        al.add(1, "Gaurav");  //Adding an element at the specific position  
        System.out.println("After invoking add(int index, E element) method: "+al);  
        
        ArrayList<String> al2 = new ArrayList<String>();  
        al2.add("Sonoo");  
        al2.add("Hanumat");  
        System.out.println("Second list:"+al2);
                  
        al.addAll(al2);  //Adding second list elements to the first list
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
        
        ArrayList<String> al3=new ArrayList<String>();  
        al3.add("John");  
        al3.add("Rahul");  
        System.out.println("Third list:" + al3);
        
        //Adding second list elements to the first list at specific position  
        al.addAll(1, al3);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);

	}

}
