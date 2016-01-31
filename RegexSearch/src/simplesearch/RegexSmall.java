package simplesearch;
import java.util.regex.*;
public class RegexSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abaaaba");
		while(m.find()){
			System.out.print(m.start() + " ");
		}
	}

}
