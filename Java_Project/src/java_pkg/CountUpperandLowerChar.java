package java_pkg;

public class CountUpperandLowerChar {

	public static void main(String[] args) {
		// Program to count upper and lower characters in string
		String s = "Welcome To AutoMation";
		String lower = "";
		String upper = "";
		int l=0, u=0;
		
		for(int i=0; i<s.length()-1; i++) {
			char c = s.charAt(i);
			if (c>=65 && c<=90) {
				upper = upper + c; //to print lower case characters
				u++;
			}
			else {
				lower = lower + c;
				l++;
			}
		}
		System.out.println("characters in upper case : "+ upper);
		System.out.println("no of upper case char : "+ u);
		System.out.println("characters in lower case : "+ lower);
		System.out.println("no of lower case char : "+ l);
	}

}
