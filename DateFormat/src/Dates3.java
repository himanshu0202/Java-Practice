import java.util.*;
import java.text.*;
public class Dates3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(1000000000000L);
		
		DateFormat[] dfa = new DateFormat[6];
		
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat d:dfa){
			System.out.println(d.format(d1));
		}
		String s = dfa[0].format(d1);
		
		try{
			Date d2 = dfa[0].parse(s);
			System.out.println("parsed= " + d2.toString());
		}catch(ParseException pe){
			System.out.println("parse exec");
		}
	}

}
