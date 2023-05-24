package methods;	// more than one constructor is called constructor overloading

public class SampleConstructor {
	
	SampleConstructor()  // non parameterized constructor. constructor name same as class name.
	{
		System.out.println("1st constructor");
	}
	
	SampleConstructor(int p, int q)      // no. of arguments must be different in constructor or data type must be different
	{
		System.out.println("2nd constructor: "+ p+q);
	}
	
	SampleConstructor (int p, double q)
	{
		System.out.println("3rd constructor: "+ p+q);
	}

	public static void main(String[] args) {
		
		System.out.println("Hello, you are in main method");
		
		new SampleConstructor();  // creating an object
		new SampleConstructor(1,2);
		new SampleConstructor(4,5.2);
	}
}
