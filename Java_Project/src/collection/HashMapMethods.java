package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {
	// Not Synchronized
	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "john");
		m.put(102, "david");
		m.put(103, "scott");
		m.put(104, "mary");
		m.put(105, "jane");
		m.put(103, "dive"); // old value replaced with new value
		m.put(106, "david");
		System.out.println(m);
		
		System.out.println(m.get(105));
		
		m.remove(106);
		System.out.println(m);
		
		System.out.println(m.containsKey(104));
		System.out.println(m.containsValue("mary"));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet()); // returns all keys as set
		System.out.println(m.values()); // returns all values as collection
		System.out.println(m.entrySet()); // returns all entries as set
		//or
		for(Object i: m.keySet()) {
			System.out.println(i+"    "+m.get(i));
		}
		System.out.println("***********");
		// entry methods
		for(Map.Entry entry : m.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println("*****************");
		// using iterator
		Set s = m.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
