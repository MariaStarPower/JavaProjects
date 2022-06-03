import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// HashSet - stores elements of the same data type into a set, which can be added to or removed from
		HashSet<String> set = new HashSet<String>();
		
		// Add values to the HashSet
		set.add("USA");
		set.add("UK");
		set.add("India");
		// Will ignore duplicate values
		set.add("India");
		set.add("Australia");
		set.add("Ireland");
		System.out.println(set);
		
		// Remove an item from the HashSet
		set.remove("UK");
		System.out.println(set);
		
		// Check whether the HashSet is empty
		System.out.println(set.isEmpty());  // Should return false
		
		// Return the size of the HashSet
		System.out.println(set.size());
		
		// Create an iterator object for iterating through the values of the HashSet
		Iterator<String> i = set.iterator();
		
		// Get the next value from the HashSet while there are values present
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}

	}

}
