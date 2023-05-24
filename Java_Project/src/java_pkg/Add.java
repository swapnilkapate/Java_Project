package java_pkg;

class A1{
	static int a=4;
}

class B1 extends A1{
	static int b=5;
}

public class Add extends B1 {

	public static void main(String[] args) {

		 int c = a + b;
		System.out.println("addition = "+c);

	}

}
