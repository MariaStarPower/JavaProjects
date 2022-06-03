
public class WhileLoops {

	public static void main(String[] args) {
		
		// While loop
		
//		while(boolean expression) {
//			// Execute code here while condition is true
//		}
		
		// Print numbers from 1 - 10
		int i = 1;
		
//		while(i <= 10) {
//			
//			System.out.println(i);  // Infinite loop - need a stopping condition
//		}
		
		while(i <= 10) {
			
			System.out.println(i);
			i++;  // Increment i by 1 through each iteration of the loop until i reaches 11
		}
		
		// Print numbers backwards from 10 - 1
		i = 10;
		
		while(i > 0) {
			
			System.out.println(i);
			i--;  // Decrement i by 1 through each iteration until i reaches 0
		}
		
		// Do-while loop
//		do {
//			// Execute code here while condition is true
//			
//		}while(boolean expression);  // Use when you want to execute code at least once before evaluating a boolean condition
		
		int j = 10;
		
		do {
			
			System.out.println(j);
			j--;
		}while(j > 0);

	}

}
