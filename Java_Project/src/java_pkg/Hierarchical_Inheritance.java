package java_pkg;

class One
{
	void mad()
	{
		System.out.println("MAD");
	}
}

class Two extends One
{
	void owl()
	{
		System.out.println("OWL");
	}
}

class Three extends Two
{
	void cat()
	{
		System.out.println("CAT");
	}
}

class Four extends One
{
	void dog()
	{
		System.out.println("DOG");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		Three t1 = new Three();
		t1.cat();
		t1.owl();
		t1.mad();
		Four f1 =new Four();
		f1.dog();
		f1.mad();

	}

}
