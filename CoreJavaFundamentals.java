
public class CoreJavaFundamentals {

	public static void main(String[] args) {
		
		// Declare and initialize variables of different types
		int myNum = 5;
		double decimalNum = 5.99;
		String sentence = "This is a sentence";
		char letter = 'r';
		boolean myCard = true;
		
		// Print the values to the console
		System.out.println(myNum);
		System.out.println(decimalNum);
		System.out.println(sentence);
		System.out.println(letter);
		System.out.println(myCard);
		
		// Print a variable and some raw text using concatenation
		System.out.println("The value stored in the myNum variable is " + myNum);
		
		// Arrays - can store multiple values in a single data type
		int[] arr = new int[5]; // create an array which stores 5 values
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {-1, 0, 5, 16, 25, 10}; // short-hand way of creating and initializing an array
		System.out.println("The value stored in the third index of the array is " + arr[2]);
		
		// For loop - can be used to print out values in an array
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			
			System.out.println(arr2[i]);
		}
		
		String[] bradyBunch = {"Greg", "Peter", "Bobby", "Marcia", "Jan", "Cindy"};
		
		for(int i = 0; i < bradyBunch.length; i++) {
			
			System.out.println(bradyBunch[i]);
		}
		
		// Enhanced For loop
		for(String brady: bradyBunch) {
			
			System.out.println(brady);
		}

	}

}
