package java_pkg;

public enum Color {
	RED("red"), GREEN("green"), BLUE("blue");
	
	private String value;
	
	Color(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
public static void main(String[] args) {
		
		Color c1 = Color.GREEN;
		
		System.out.println("Red Enum Name: "+c1.name());
		System.out.println("Red Enum value: "+c1.getValue());
		
		for (Color co : Color.values()) {
			System.out.println("Enum value: "+co.value);
		}
		
	}

}
