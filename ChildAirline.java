
public class ChildAirline extends ParentAirCraft {

	public static void main(String[] args) {
		
		// ParentAirCraft parent = new ParentAirCraft(); - Cannot instantiate from an abstract class
		ChildAirline airline = new ChildAirline();
		
		airline.engine();
		airline.safety();
		airline.bodyColor();

	}

	// Abstract method implemented from ParentAirCraft
	@Override
	public void bodyColor() {
		
		System.out.println("Body color is red");
	}

}
