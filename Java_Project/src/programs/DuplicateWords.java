package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		
		String s;
//		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		s = sc.nextLine();
		
		s = s.toLowerCase(); // convert whole string into lowercase
		String[] w = s.split(""); // split the string into words using 
		
		/*System.out.println("Duplicate words in a given string are : ");
		for(int i=0; i< w.length; i++)
		{
			count =1;
			for(int j=i+1; j< w.length; j++)
			{
				if(w[i].equals(w[j]))
				{
					count++;
					w[j]="0"; //set w[j] to 0 to avoid printing visited word
				}
			}
			if(count>1 && w[i] !="0")
			{
				System.out.print(w[i]);
			}
		}*/
		
		List<String> rw = new ArrayList<>();
		
		HashSet<String> uw = new HashSet<>();
		
		for(String str : w)
		{
			if(!uw.add(str))
				rw.add(str);
		}
		System.out.println(rw);
		sc.close();
	}
}
