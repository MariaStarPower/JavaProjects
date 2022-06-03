
public class ConstructorDemo {
	
	// A constructor executes a block of code whenever an object is created, does not return any values
	
	public ConstructorDemo() {
		
		System.out.println("I am in a constructor.");
	}
	
	public ConstructorDemo(int a, int b) {
		
		System.out.println("I am in a parametrized constructor.");
		System.out.println(a + b);
	}
	
	public ConstructorDemo(String s) {
		
		System.out.println(s);
	}
	
	public void getData() {
		
		System.out.println("I am a method.");
	}

	public static void main(String[] args) {
		
		ConstructorDemo demo = new ConstructorDemo();
		ConstructorDemo demo2 = new ConstructorDemo(4, 5);
		ConstructorDemo demo3 = new ConstructorDemo("Hello");

	}

}
