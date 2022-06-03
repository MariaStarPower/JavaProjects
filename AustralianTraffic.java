
public class AustralianTraffic implements TrafficCentral, ContinentalTraffic {

	public static void main(String[] args) {
		
		TrafficCentral central = new AustralianTraffic();
		
		central.green();
		central.yellow();
		central.red();
		walk();
		dontWalk();
		central.green();
		
		ContinentalTraffic traffic = new AustralianTraffic();
		traffic.train();
	}

	// Methods implemented from TrafficCentral
	@Override
	public void green() {
		
		System.out.println("Go ahead");
	}

	@Override
	public void red() {
		
		System.out.println("Stop");
	}

	@Override
	public void yellow() {
		
		System.out.println("Slow down");
	}
	
	// Local methods
	public static void walk() {
		
		System.out.println("Walk now");
	}
	
	public static void dontWalk() {
		
		System.out.println("Don't walk now");
	}

	// Method implemented from ContinentalTraffic
	@Override
	public void train() {
		
		System.out.println("Watch out for the train");
	}

}
