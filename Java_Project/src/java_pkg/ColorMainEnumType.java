package java_pkg;

public class ColorMainEnumType {

	public static void main(String[] args) {
		
		Color c1 = Color.GREEN;
		
		System.out.println("Red Enum Name: "+c1.name());
		System.out.println("Red Enum value: "+c1.getValue());
		
		for (Color co : Color.values()) {
			System.out.println("Enum value: "+co.getValue());
		}
		
	}

}
