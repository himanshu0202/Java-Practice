import java.util.Date;
public class CheckGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=1;
		final int b;
		b=2;
		int x=0;
		switch(x){
		case a: System.out.println("ok");
		case b: System.out.println("not ok");
		}
	}

}
