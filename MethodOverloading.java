
public class MethodOverloading {
	
	// Method overloading - same method name, but with different parameters
	
	public static void getData(int a) {
		
		System.out.println(a);
	}
	
	public static void getData(String a) {
		
		System.out.println(a);
	}
	
	public static void getData(int a, int b) {
		
		System.out.println(a + b);
	
	}
	public static void main(String[] args) {
		
		getData(2);
		getData("Hello");
		getData(2, 5);
	}

}
