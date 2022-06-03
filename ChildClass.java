
public class ChildClass extends ParentClass {
	
	public void engine() {
		
		System.out.println("New engine");
	}
	
	// Method overriding - same method name and parameters, but with different implementation
	
	public void audio() {
		
		System.out.println("New audio code is implemented");
	}
	
	public void color() {
		
		System.out.println(color);
	}

	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		
		child.gear();
		child.brakes();
		child.audio();
		child.engine();
		child.color();

	}

}
