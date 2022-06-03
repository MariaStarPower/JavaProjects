import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		
		// Print the unique numbers from the array
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++) {
			
			int k = 0;
			
			if(!list.contains(a[i])) {
				
				list.add(a[i]);
				k++;
				
				for(int j = i + 1; j < a.length; j++) {
					
					if(a[i] == a[j]) {
						
						k++;
					}
				}
				// Print each of the numbers and how many times they appear
				System.out.println(a[i] + " - " + k);
				
				// If there is only 1 count for a number, it is unique
				if(k == 1)
					System.out.println(a[i] + " is the unique number.");
			}
		}

	}

}
