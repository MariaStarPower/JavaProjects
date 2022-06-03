
public class ChildClassDemo extends ParentClassDemo {
	
	// Locally defined variable will override the same variable from the parent class
	String name = "QAClickAcademy";
	
	public ChildClassDemo() {
		
		// Call the constructor from the parent class
		super();
		System.out.println("Child class constructor");
	}
	
	public void getStringData() {
		
		System.out.println(name);
		// Call the variable from the parent class
		System.out.println(super.name);
	}
	
	// Method of the same name from the parent class will be overridden in the child class
	public void getData() {
		
		// Call the method from the parent class
		super.getData();
		System.out.println("I am in the child class.");
	}

	public static void main(String[] args) {
		
		ChildClassDemo childClass = new ChildClassDemo();
		childClass.getStringData();
		childClass.getData();

	}

}
