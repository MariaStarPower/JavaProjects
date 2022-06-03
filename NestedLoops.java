
public class NestedLoops {

	public static void main(String[] args) {
		
		// Nested loop
		
		// Outer for loop
		for(int i = 1; i <= 4; i++) {  // This loop will run 4 times
			
			System.out.println("Outer loop " + i);	
			
			// Inner for loop
			for(int j = 1; j <= 4; j++) {  // This loop will run 4 times for each iteration of the outer loop for a total of 16
				
				System.out.println("Inner loop " + j);
			}
		}
		
		// Print a pyramid of numbers
//		1 2 3 4
//		5 6 7
//		8 9 
//		10
		int k = 1;
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 1; j <= 4 - i; j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		// Print a pyramid of numbers in reverse
//		1
//		2 3
//		4 5 6
//		7 8 9 10
		k = 1;
		for(int i = 1; i < 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		// Print a pyramid of numbers while resetting the numbers through each iteration
//		1
//		1 2
//		1 2 3
//		1 2 3 4
		for(int i = 1; i < 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}

	}

}
