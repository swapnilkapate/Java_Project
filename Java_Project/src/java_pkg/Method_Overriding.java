package java_pkg;

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike running safely");
	}
}

class Car extends Vehicle {
	void run() {
		System.out.println("car is running");
	}
}

public class Method_Overriding {

	void run() {
		System.out.println("run method in child class is running");
	}
	
	public static void main(String[] args) {
		
			Method_Overriding obj = new Method_Overriding();
			obj.run();
			
			Bike obj1 = new Bike();
			obj1.run();  

			Vehicle v;
			v = new Bike();    //whenever you create instance then you have call method, here "new Bike()" is the instance
			v.run();
			v = new Car();	
			v.run();
			//v = new Method_Overriding();
			//v.run();
			//if you create many instance and you are calling method, then only last created instance will run respective method.


	}

}
