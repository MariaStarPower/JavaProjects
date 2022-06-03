
public class ExceptionDemo {

	public static void main(String[] args) {
		
		// Use try - catch block to handle an exception for a possible error
		try {
			
			int b = 7;
			int c = 0;
			int k = b / c;
			// Will produce a "division by zero error"
			System.out.println(k);
		}
		// Exception that is most specific to the error will be executed
		catch(ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			System.out.println("I caught the ArithmeticException");
		}
		catch(IndexOutOfBoundsException i) {
			
			System.out.println(i.getMessage());
			System.out.println("I caught the IndexOutOfBoundsException");
		}
		// General exception block
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("I caught the error.");
		}
		// Will be executed at the end, regardless of errors (this is optional)
		finally {
			
			System.out.println("Finished!");
		}
		
		try {
			
			int arr[] = new int[5];
			
			// Will produce an "index out of bounds" error
			System.out.println(arr[7]);
		}
		catch(ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			System.out.println("I caught the ArithmeticException");
		}
		// This exception will be executed
		catch(IndexOutOfBoundsException i) {
			
			System.out.println(i.getMessage());
			System.out.println("I caught the IndexOutOfBoundsException");
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("I caught the error.");
		}
		finally {
			
			System.out.println("Finished!");
		}
	}

}
