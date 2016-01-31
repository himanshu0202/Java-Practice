package tokenizing;
import java.util.*;
public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] token = args[0].split(args[1]);
		System.out.println("Count: " + token.length);
		for(String s: token)
			System.out.println(">" + s + "<");
	}

}
