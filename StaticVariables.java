
public class StaticVariables {
	
	// Instance variables - are used in instances of objects defined within a class
	String name;
	String address;
	
	// Static variables - are independent of objects / are used at the class level
	static String city;
	static int i;
	
	// Static block
	static {
		
		city = "Bangalore";
		i = 0;
	}
	
	StaticVariables(String name, String address) {
		
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		
		System.out.println(address + " " + city);
	}
	
	// Static methods can only use static variables
	public static void getCity(){
		
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		StaticVariables object = new StaticVariables("Bob", "Marthalli");
		StaticVariables object2 = new StaticVariables("Ram", "Jayangar");
		object.getAddress();
		object2.getAddress();
		getCity();
		StaticVariables.i = 4;
		System.out.println(StaticVariables.i);
		object.address = "XZY";
		System.out.println(object.address);
	}

}
