import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dates3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		c.set(2016, 0, 17);
		Date d2 = c.getTime();
		Locale locIN = new Locale("hi","IN");

		System.out.println("def " + locIN.getDisplayCountry());
		System.out.println("loc " + locIN.getDisplayCountry(locIN));
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, locIN);
		System.out.println("INDIA      " + df.format(d2));
		String s = df.format(d2);
		try{
			Date d3=df.parse(s);
			System.out.println("parse= " + d2.toString());
		}
		catch(ParseException ex)
		{ex.printStackTrace();}
		
	}

}
