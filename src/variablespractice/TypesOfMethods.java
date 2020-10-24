package variablespractice;

public class TypesOfMethods {

	public static void main(String[] args) {
		printmyname();
		String cup= getmeacoffee();
		
		System.out.println(cup);
		
		getmeacoffee();
		
		TypesOfMethods typesofmethods=new TypesOfMethods();
		
		typesofmethods.printmyage();
		
		boolean good= isitsunnytoday();
		System.out.println(good);
		
		getmyage();
		
		int age= getmyage();
		System.out.println(age);
		
		
		
	}
	

	
	// static methods
	
	public static void printmyname() {
	System.out.println("Nafa");
	}
	
	// non static methods
	public void printmyage() {
	System.out.println(25);
	}
	
	// static return type methods
	
	public static int getmyage() {
	return 30;
		
	}
	// non static return type methods
	public static String getmeacoffee() {
		return "espresso";
	}
		
	public static boolean isitsunnytoday() {
		return true;
}
}
	
