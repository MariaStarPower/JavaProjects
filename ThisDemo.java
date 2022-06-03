
public class ThisDemo {
	
	int a = 2;
	
	public void getData() {
		
		int a = 3;
		
		// The "this" keyword refers to variables defined at the class level
		int b = a + this.a;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisDemo demo = new ThisDemo();
		demo.getData();

	}

}
