package scannerexample;
import java.util.*;
public class ScanIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input: ");
		System.out.flush();
		try{
			Scanner s = new Scanner(System.in);
			String token;
			do{
				token = s.findInLine(args[0]);
				System.out.println("found " + token);
			}while(token != null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
