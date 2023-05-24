package methods;

class One {
	One()
	{  
		System.out.println("Hello");
	}
}

class Two extends One {
	Two()
	{   // if we did not write super() statement, then it will get added implicitly and immediate super class constructor gets executed.
		System.out.println("Welcome");
	}
}

class Three extends Two {
	Three()
	{
		super();
		System.out.println("to java Programming");
	}
}

public class SuperInConstructor {

	public static void main(String[] args) {
		
		new Three();

	}

}
