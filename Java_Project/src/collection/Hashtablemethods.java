package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hashtablemethods {
	// Synchronized and thread safe
	public static void main(String[] args) {
		
		//Hashtable ht = new Hashtable();// default size 11, load factor 0.75
		Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		t.put(101, "john");
		t.put(102, "david");
		t.put(103, "scott");
		t.put(104, "mary");
		t.put(105, "jane");
		t.put(103, "dive"); // old value replaced with new value
		t.put(106, "david");
//		t.put(null, null); // does not allow null in key or value. throws NullPointerException
		System.out.println(t);
		
		t.remove(103);
		System.out.println(t);
		System.out.println(t.containsKey(104));
		System.out.println(t.containsValue("mary"));
		
		System.out.println(t.isEmpty());
		
		System.out.println(t.keySet()); // returns all keys as set
		System.out.println(t.values()); // returns all values as collection
		System.out.println(t.entrySet()); // returns all entries as set
		//or
		for(Object i: t.keySet()) {
			System.out.println(i+"    "+t.get(i));
		}
		System.out.println("***********");
		// entry methods
		for(Map.Entry entry : t.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println("*****************");
		// using iterator
		Set s = t.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}

	}

}
