package java_pkg;

public class Multilevel_Inheritance extends Class3 {
	
	void method4() {
		System.out.println("method4 is executed");
	}

	public static void main(String[] args) {
		
		Multilevel_Inheritance obj = new Multilevel_Inheritance();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();

	}

}
