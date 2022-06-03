
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		// Multidimensional array - [row][column]
		
		int grid[][] = new int[2][3];
		
		grid[0][0] = 2;
		grid[0][1] = 4;
		grid[0][2] = 5;
		grid[1][0] = 3;
		grid[1][1] = 4;
		grid[1][2] = 7;
		
		// Print value from the second row, first column
		System.out.println(grid[1][0]);
		
		// Declare and initialize a multidimensional array in the same line
		int grid2[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		// Print value from the third row, second column
		System.out.println(grid2[2][1]);
		
		// Print the entire multidimensional array
		for(int i = 0; i < grid2.length; i++) {   // Outer loop is for the rows
			
			for(int j = 0; j < grid2[i].length; j++) {	// Inner loop is for the columns
				
				System.out.println(grid2[i][j]);
			}
		}
		
		// Print the multidimensional array in grid format
//		1 2 3
//		4 5 6
//		7 8 9
		for(int i = 0; i < grid2.length; i++) {
					
			for(int j = 0; j < grid2[i].length; j++) {
						
				System.out.print(grid2[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}

	}

}
