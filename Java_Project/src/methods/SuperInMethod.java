package methods;

class Animal{  
void eat()
	{
	System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
void eat()
	{
	System.out.println("eating bread...");
	}  
void bark()
	{
	System.out.println("barking...");
	}  
void work()
	{  
	super.eat();  // This will go to parent class for eat method. if we do not use super here then this class gets executed.
	bark();  
	}  
} 

public class SuperInMethod {

	public static void main(String[] args) {
		
		Dog d=new Dog();  
		d.work(); 

	}

}
