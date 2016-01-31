import java.util.*;
public class Dates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(1000000000000L);
		System.out.println("1st Date" + d1.toString());
		
		Calendar c =Calendar.getInstance();
		c.setTime(d1);
		
		if(Calendar.SUNDAY == c.getFirstDayOfWeek())
			System.out.println("Sunday is the first day of the week");
		System.out.println("trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK));
		c.add(Calendar.MONTH, 1);
		Date d2 = c.getTime();
		System.out.println("new date" + d2.toString());
	}

}
