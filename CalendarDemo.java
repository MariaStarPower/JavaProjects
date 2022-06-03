import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat newFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		System.out.println(newFormat.format(calendar.getTime()));
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar.get(Calendar.AM_PM));  // Will print 0 if in the AM and 1 if in the PM
		System.out.println(calendar.get(Calendar.MINUTE));

	}

}
