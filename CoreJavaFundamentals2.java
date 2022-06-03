import java.util.ArrayList; // Import the ArrayList class from the java.util package

public class CoreJavaFundamentals2 {

	public static void main(String[] args) {
		
		// Create an array of numbers
		int[] numbersArr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};
		
		// Print only the even values from the array
		for(int i = 0; i < numbersArr.length; i++) {
			
			// Use a condition to check if the number is even
			if(numbersArr[i] % 2 == 0) {
				
				System.out.println(numbersArr[i]);
			}
		}
		
		// Loop through the array and print "even" if the value is even, and "odd" if the value is odd
		for(int i = 0; i < numbersArr.length; i++ ) {
			
			// Check if the number is even and print "even" to the console
			if(numbersArr[i] % 2 == 0) {
				
				System.out.println("even");
			}
			// If the number does not match the above condition, print "odd" to the console
			else {
				
				System.out.println("odd");
			}
			
		}
		
		// Create an array using the ArrayList class
		ArrayList<String> bradys = new ArrayList<String>();
		// Add values to the array
		bradys.add("Greg");
		bradys.add("Petter");
		bradys.add("Bobby");
		bradys.add("Marcia");
		bradys.add("Jan");
		bradys.add("Cindy");
		bradys.add("Alice");
		
		// Get the value at the fourth index of the array
		System.out.println(bradys.get(4));
		
		// Print the values of the array
		for(String brady : bradys) {
			
			System.out.println(brady);
		}
		
		// Remove an item from the array
		bradys.remove("Alice");
		
		// Print the values of the modified array
		for(String brady : bradys) {
			
			System.out.println(brady);
		}
		
	}

}
