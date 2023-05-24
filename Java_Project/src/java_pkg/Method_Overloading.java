package java_pkg;

class X {
	int addmethod(int a, int b) {
		return a+b;
	}
	
	double addmethod(double a, double b, double c) {
		return a+b+c;
	}
}

public class Method_Overloading {

	public static void main(String[] args) {
		
		X obj = new X();
		System.out.println(obj.addmethod(2.1,6.2,1));
		
		System.out.println(obj.addmethod(5,9));
	}
}
