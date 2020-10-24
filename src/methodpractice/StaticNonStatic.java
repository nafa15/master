package methodpractice;

public class StaticNonStatic {

	// default constructor -->same name as the classname, no void/static 
	// optional to create default constructor
	
	public StaticNonStatic() {
		printMyName();
		printmyage();
		
		
	}
	
	public static void main(String[] args) {
		printMyName();
		
		
		StaticNonStatic staticobject= new StaticNonStatic();
		staticobject.printmyage();
		
		
		// object creation of the class
		StaticNonStatic refferencevariable= new StaticNonStatic();
		// name of the class that we want to create object of --- refferencevariable of the class (=new)--> law name of constructor
		
		refferencevariable.printMyName();
		refferencevariable.printmyage();
		
	}
	
	public static void printMyName() {
		System.out.println("Nafa");
		
		
		
	}
	public void printmyage( ) {
		printMyName();
		System.out.println(25);
		
	
	}
	
	
	// static --> keyword
	// static method/variable --> can go inside static or non static method
	// non-static method/variable --> can go inside non-static method only
	// if we still have to call non static methods, we should use objects of the class
	
	
	
}
