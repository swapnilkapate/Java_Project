package methods;

public class Methods {

	static int a = 10;  // static variable
	double b = 0.01;   // non-static variable
	
	void four() // non-static method
	{
		System.out.println("Non-static method4 is executed");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		two(); // calling static method two
		three(); // calling static method three
		
		Methods m = new Methods();  // creating object for non-static method
		m.four();  // calling non-static method four
		
		System.out.println(a); // calling static variable
		System.out.println(m.b); // calling non-static variable using object
		
	}
	
	static void two() // static method
	{
		System.out.println("Method2 is executed");
	}
	
	static void three() //static method
	{
		System.out.println("Method3 is executed");
	}

	}
