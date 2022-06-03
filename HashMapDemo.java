import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// HashMap - stores elements of key - value pairs
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Put items into the HashMap
		map.put(0, "Winter");
		map.put(1, "Spring");
		map.put(2, "Summer");
		map.put(3, "Fall");
		
		// Retrieve the value at a specified index
		System.out.println(map.get(2));
		
		System.out.println(map.get(42));  // Will return null because that index does not exist
		
		// Create a Set of the HashMap object
		Set<Entry<Integer, String>> set = map.entrySet();
		
		// Create an Iterator for the Set
		Iterator<Entry<Integer, String>> i = set.iterator();
		
		while(i.hasNext()) {
			
			Entry<Integer, String> entry = (Entry<Integer, String>)i.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}
