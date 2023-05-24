package collection;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		// All methods from arraylist can be used with linkedlist
        li.add("Swapnil");
        li.add(25);
        li.add('K');
        li.add(15.5);
        li.add(true);
        li.add(null);
        System.out.println(li);
        System.out.println("list size: "+li.size());
        
        //LinkedList Specific methods
        LinkedList list = new LinkedList();
        list.add("Mango");	//Adding object in lLinkedList    
	    list.add("Apple");    
	    list.add("Banana");    
	    list.add("Grapes");  
	    System.out.println(list);
	    
	    list.addFirst("Chikoo");
	    list.addLast("Watermelon");
	    System.out.println(list);
	    System.out.println("First: "+list.getFirst());
	    System.out.println("Last: "+list.getLast());
	    
	    list.removeFirst();
	    list.removeLast();
	    System.out.println("after removing first and last object: "+list);
	    
        
        
	}

}
