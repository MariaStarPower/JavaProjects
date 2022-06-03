
public class CoreJavaFundamentals3 {

	public static void main(String[] args) {
		
		// Strings
		
		// String literal
		String s1 = "This is a string";
		String s2 = "This is another string";
		
		System.out.println(s1);
		System.out.println(s2);
		
		// Creating a new String object
		String s3 = new String("This is also a string");
		
		System.out.println(s3);
		
		// String methods
		String[] splitString = s3.split(" ");  // split
		
		// Print each of the elements in the split String array
		for(String s : splitString) {
			
			System.out.println(s);
		}
		
		// Print each individual character of the string
		for(int i = 0; i < s3.length(); i++) {
			
			System.out.println(s3.charAt(i)); // Get the character at the specified index
		}
		
		// Print each character of the string in reverse
		for(int i = s3.length() - 1; i >= 0; i--) {
			
			System.out.println(s3.charAt(i));
		}
		
		String hello = "   Hello World    ";
		
		System.out.println(hello);
		System.out.println(hello.trim());  // trim
		
		String name = "Maria";
		
		System.out.println(name);
		System.out.println(name.length());  // length
		

	}


}
