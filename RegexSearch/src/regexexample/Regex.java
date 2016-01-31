package regexexample;
import java.util.regex.*;
public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pattern p = Pattern.compile(args[0]);
			Matcher m = p.matcher(args[1]);
			System.out.println("Pattern is " + m.pattern());
			while(m.find()){
				System.out.println(m.start() + " " + m.end() + m.group());
			}
	}

}
