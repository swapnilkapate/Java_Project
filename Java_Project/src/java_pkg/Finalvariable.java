package java_pkg;

public class Finalvariable {
	final int data;
	
	Finalvariable(int a){
	data = 5;
	}
	
	Finalvariable(){
		data = 6;  
		/*
		 * when you declare any blank final variable, you need to initialised in
		 * constructor. if there are multiple constructors, you need to initialised
		 * blank final variable in every constructor. Otherwise it will give compile
		 * time error.
		 */	}
	
	public static void main(String[] args) {
		

	}

}
