package java_pkg;

class Class3 extends Class2 {
	public void method1() {
		System.out.println("method1 is executed");
	}
	
	public void method2() {
		System.out.println("method2 is executed");
	}
	
}

public class Single_Inheritance {

	public static void main(String[] args) {
		
		/*Class3 obj = new Class3();
		obj.method1();
		obj.method2();
		
		Class2 obj1 = new Class2();
		obj1.method3(); */
		
		Class3 obj = new Class3();
		obj.method1();
		obj.method2();
		obj.method3();

	}

}

class Class2{
	public void method3() {
		System.out.println("method3 is executed");
	}
}