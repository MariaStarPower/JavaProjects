// Abstract class can have regular methods and abstract methods
// Abstract methods do not have a body
public abstract class ParentAirCraft {
	
	public void engine() {
		
		System.out.println("Follow engine guidelines");
	}
	
	public void safety() {
		
		System.out.println("Follow safety guidelines");
	}
	
	public abstract void bodyColor();
 }
