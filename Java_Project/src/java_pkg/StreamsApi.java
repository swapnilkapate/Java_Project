package java_pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi {

	public static void main(String[] args) {
		
		List<String> lang = new ArrayList<>();
		
		lang.add("Java");
		lang.add("Python");
		lang.add("C#");
		
		List<String> filterResult = new ArrayList<>();
		for(String s:lang) {
			if(s.startsWith("P"))
				filterResult.add(s);
		}
		
		System.out.println(filterResult);
		//or
		List<String> filterResult1 = lang.stream().filter(s->s.startsWith("P"))
										.collect(Collectors.toList());
		
		System.out.println("Lang starts with P :"+filterResult1);
		
		//Collections.sort(lang);
		System.out.println(lang);
		// for sorting
		List<String> sortedlist = lang.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
		
		System.out.println("Printing all list one by one");
		lang.stream().forEach(y->System.out.println("element is: "+y));
		
	}

}
