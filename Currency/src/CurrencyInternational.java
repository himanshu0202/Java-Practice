import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CurrencyInternational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 123.4567f;
		Locale locIN = new Locale("IN");
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locIN);
		nfa[2] =NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locIN);
		for(NumberFormat nf : nfa)
		    System.out.println(nf.format(f1));
	}

}
