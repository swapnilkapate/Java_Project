package collection;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		
		//HashSet hs = new HashSet(); // default capacity 16 and load factor 0.75
		//HashSet hs = new HashSet(100); // initial capacity 100 and load factor 0.75
		//HashSet hs = new HashSet(100, (float) 0.95); // initial capacity 100 and load factor 0.95
		HashSet hs = new HashSet();
		hs.add("Swapnil");
        hs.add(25);
        hs.add('K');
        hs.add(15.5);
        hs.add(true);
        hs.add(null);
        System.out.println(hs); // insertion order not preserved
        System.out.println("list size: "+hs.size());
        hs.add(15.5);
        
        hs.remove(25);
        System.out.println("after removing 25: "+hs);
        System.out.println(hs.contains('K'));
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);
        
        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println(set2);
        
        //union
        set1.addAll(set2);
        System.out.println("Union of set1 and set2: "+set1); //[1, 2, 3, 4, 5]
        
        // Intersection
        set1.retainAll(set2);
        System.out.println("Common: "+ set1);  // [3, 4, 5]
        
        // difference
        set1.removeAll(set2);
        System.out.println("difference: "+set1); // [1, 2]
        
        //subset
        System.out.println(set1.containsAll(set2));
        



	}

}
