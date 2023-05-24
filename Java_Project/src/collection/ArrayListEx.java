package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("infy");
		l.add("google");
		l.add("ibm");
		l.add("amzn");
		
		System.out.println("Original list : "+l);
		
		for (int j=0; j<l.size(); j++)
		{
			System.out.println("in for loop : "+l);
			l.remove(j);
			System.out.println("After removing "+j+" postion element : "+l);
			if (l.get(j++).equals("google"))
			{
				System.out.println("In if loop : ");
				l.add("oracle");
			}
			
		}
		System.out.println("out of all loops : "+l);

	}

}
