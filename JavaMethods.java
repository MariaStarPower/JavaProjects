
public class JavaMethods {

	public static void main(String[] args) {
		
		// Call a method
		greeting();
		
		// Initialize a variable with a call to a method
		int favorite = favoriteNum();
		
		System.out.println(favorite);
		
		String myName = getName("Maria");
		
		System.out.println(myName);
		
		// Need to create an instance of a class to use its associated methods
		JavaMethods2 methods = new JavaMethods2();
		
		int add = methods.addNums(5, 3);
		int subtract = methods.subtractNums(10, 4);
		int multiply = methods.multiplyNums(6, 5);
		int divide = methods.divideNums(20, 2);
		
		// Attach a static method to the class itself, instead of an instance of the class
		int squared = JavaMethods2.squareNum(4);
		
		System.out.println(add);
		System.out.println(subtract);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(squared);

	}
	
	// Method that does not return anything -> use "void" as the return type
	public static void greeting() {
		System.out.println("Hello from inside of a method!");
	}
	
	// Method that returns a value -> need to specify a data type to return
	public static int favoriteNum() {
		return 27;
	}
	
	// Method that accepts a parameter
	public static String getName(String name) {
		return "Hello " + name;
	}

}
