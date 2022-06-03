
public class ArraysDemo {

	public static void main(String[] args) {
		
		// Array - stores multiple values of the same data type into a single object, which is immutable
		
		// Declare an array of integers and allocate memory for 5 values
		int a[] = new int[5];
		
		// Assign array values to their index - array indexing begins at 0
		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12;
		
		// Retrieve the individual values from the array
		for(int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		// Declare and initialize an array of numbers in the same line
		int b[] = {1,4,3,5,7,8};
		
		for(int i = 0; i < b.length; i++) {
					
			System.out.println(b[i]);
		}

	}

}
