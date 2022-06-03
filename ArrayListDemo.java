import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// ArrayList - stores elements of the same data type into a list, which can be added to or removed from
		ArrayList<String> a = new ArrayList<String>();
		
		// Add items to the ArrayList
		a.add("Rahul");
		a.add("Java");
		// Can add duplicate values
		a.add("Java");
		System.out.println(a);
		
		// Add an item at a specified index
		a.add(0, "Student");
		System.out.println(a);
		
		// Remove an item at a specified index
//		a.remove(1);
//		System.out.println(a);
		// Remove an item by name
//		a.remove("Java");
//		System.out.println(a);
		
		// Retrieve an item at a specified index
		System.out.println(a.get(2));
		
		// Check whether an item is present in the ArrayList
		System.out.println(a.contains("testing"));  // Should return false
		System.out.println(a.contains("Java"));	  // Should return true
		
		// Retrieve the index at which the particular element is stored
		System.out.println(a.indexOf("Rahul"));
		
		// Check whether the ArrayList is empty
		System.out.println(a.isEmpty());  // Should return false
		
		// Get the size of the ArrayList
		System.out.println(a.size());

	}

}
