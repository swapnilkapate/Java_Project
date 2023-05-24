package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		 ArrayList<String> list = new ArrayList<String>();//Creating arraylist
		 
	      list.add("Mango");	//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");   
	      System.out.println("After invoking add(E e) method: "+list);  
          list.add(1, "Watermelon"); //Adding an element at the specific position
	      
	      System.out.println("After invoking add(int index, E element) method: "+list);
	      
	      //Traversing list through Iterator  
	      Iterator<String> itr=list.iterator();		//getting the Iterator  
	      while(itr.hasNext()){				//check if iterator has the elements  
	       System.out.println(itr.next());	//printing the element and move to next
	      }
	      System.out.println("");
	    	      
	    //accessing the element    
	      System.out.println("Returning element: "+list.get(1));	//it will return the 2nd element, because index starts from 0  
	      	      
	      list.set(1,"Dates");   //changing the element 
	      
	      //Traversing list through for-each loop  
	      for(String fruit:list)    
	        System.out.println(fruit);
	      
	      System.out.println("");  
	      Collections.sort(list);   //Sorting the list alphabetically
	       //Traversing list through the for-each loop  
	      for(String fruit:list)  
	        System.out.println(fruit);
	      
	      ArrayList<String> al2=new ArrayList<String>();  
          al2.add("Sonoo");  
          al2.add("Hanumat");  
            
          list.addAll(al2);  //Adding second list elements to the first list
          System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list);  
          
          ArrayList<String> al3=new ArrayList<String>();  
          al3.add("John");  
          al3.add("Rahul");  
            
          list.addAll(1, al3);  //Adding second list elements to the first list at specific position
          System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+list);
          
          
	      System.out.println("Traversing list through List Iterator: in Reverse Order");  
          //Here, element iterates in reverse order 
	     
             ListIterator<String> list1 = list.listIterator(list.size());  
             while(list1.hasPrevious())  
             {  
                 String str=list1.previous();  
                 System.out.println(str);  
             } 
             
       System.out.println("Traversing list through for loop:");  
          for(int i=0;i<list.size();i++)  
          {  
           System.out.println(list.get(i));     
          }  
	      
	      System.out.println("Sorting numbers...");  
	        
	      ArrayList<Integer> list2=new ArrayList<Integer>();  //Creating a list of numbers
	      list2.add(21);  
	      list2.add(11);  
	      list2.add(51);  
	      list2.add(1);  
	       
	      Collections.sort(list2);  //Sorting the list 
	       //Traversing list through the for-each loop  
	      for(Integer number:list2)  
	        System.out.println(number);
	      
	      Collections.sort(list2, Collections.reverseOrder());// sort in reverse order
	      System.out.println("After sorting in reverse order: "+list2);
	      
	      Collections.shuffle(list2); // To Shuffle
	      System.out.println("After shuffling: "+list2);
	      
	      ArrayList<String> al=new ArrayList<String>();  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");   
          al.add("Anuj");  
          al.add("Gaurav");  
          System.out.println("An initial list of elements: "+al);   
          
          al.remove("Vijay");   //Removing specific element from arraylist 
          System.out.println("After invoking remove(object) method: "+al);   
            
          al.remove(0);  //Removing element on the basis of specific position
          System.out.println("After invoking remove(index) method: "+al);   
                      
          ArrayList<String> al4=new ArrayList<String>();     //Creating another arraylist 
          al4.add("Ravi");    
          al4.add("Hanumat");    
          
          al.addAll(al4);    //Adding new elements to arraylist
          System.out.println("Updated list : "+al);   
           
          al.removeAll(al4);  //Removing all the new elements from arraylist 
          System.out.println("After invoking removeAll() method: "+al);   
          //Removing elements on the basis of specified condition  
          al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
          System.out.println("After invoking removeIf() method: "+al);  
          //Removing all the elements available in the list  
          al.clear();  
          System.out.println("After invoking clear() method: "+al);
          
          ArrayList li = new ArrayList(); // stores heterogeneous data
          li.add("Swapnil");
          li.add(25);
          li.add('K');
          li.add(15.5);
          li.add(true);
          li.add(null);
          System.out.println(li);
          li.size();
          System.out.println(li.contains(15.5));
          
          // to convert array to arraylist
          String arr[] = {"Dog", "Cat", "Elephant", null};
          ArrayList<String> arl = new ArrayList<String>(Arrays.asList(arr));
          System.out.println(arl);
          
          
	}

}
