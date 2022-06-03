import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		
		System.out.println(dateFormat.format(date));
		
		SimpleDateFormat newFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		System.out.println(newFormat.format(date));

	}

}
