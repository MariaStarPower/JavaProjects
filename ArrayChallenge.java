
public class ArrayChallenge {

	public static void main(String[] args) {
		
		// Find the minimum and maximum values from the 3 x 3 matrix
		/*
		2 4 5
		3 4 10
		1 2 9
		*/
		int abc[][] = {{2,4,5}, {3,4,10}, {1,2,9}};
		
		int min = abc[0][0];
		int max = abc[abc.length-1][abc.length-1];
		
		for(int i = 0; i < abc.length; i++) {
			
			for(int j = 0; j < abc[i].length; j++) {
				
				// Print out grid
				System.out.print(abc[i][j]);
				System.out.print("\t");
				
				// Check if the number at the given position is less than the minimum value
				if(abc[i][j] < min) {
					
					// Assign min to that value
					min = abc[i][j];
				}
				// Check if the number at the given position is greater than the maximum value
				if(abc[i][j] > max) {
					
					// Assign max to that value
					max = abc[i][j];
				}
			}
			System.out.println("");
			
		}
		
		System.out.println("The smallest number is " + min);
		System.out.println("The biggest number is " + max);

	}

}
