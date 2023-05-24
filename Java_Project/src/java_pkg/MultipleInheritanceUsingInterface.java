package java_pkg;

interface vehicleone{
	int  speed=90;
	public void distance();
}

interface vehicletwo{
	int distance=100;
	public void speed();
}

class Vehicle1  implements vehicleone,vehicletwo{
	
	public void distance(){
		int  distance = speed*100; 
		System.out.println("distance travelled is "+distance);
	}
	
	public void speed(){
		int speed = distance/100;
		System.out.println("Speed of vehicle is "+speed);
	}
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		
		System.out.println("Vehicle");
		Vehicle1 obj = new Vehicle1();
		obj.distance();
		obj.speed();

	}

}
