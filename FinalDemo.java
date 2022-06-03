
// Classes declared as "final" cannot be extended from subclasses
final class FinalDemo {
	
	// Methods declared with "final" cannot be overridden
	final static void getData() {
		
		System.out.println("This is a method declared with a final modifier.");
	}

	public static void main(String[] args) {
		
		// Use the "final" keyword to assign a variable as a constant / cannot be changed
		final int i = 4;
		// Will cause an error
		// i = 5;
		System.out.println(i);
		getData();

	}

}
