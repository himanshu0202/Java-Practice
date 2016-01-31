package prime;
import java.util.Scanner;
public class Primenumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		boolean[] prime;
		Primenumbers pn=new Primenumbers();
		prime=pn.printPrimes(n);
		for(int i=2;i<=n;i++){
			System.out.println("number is prime: " + prime[i]);
		}
	}
	
	public static boolean[] printPrimes(int n){
		boolean[] primenum=new boolean[n+1];
		for(int i=2;i<=n;i++){
			primenum[i]=true;
		}
		for(int divisor=2;divisor*divisor<=n;divisor++){
			if(primenum[divisor]){
				for(int i=2 * divisor;i<=n;i=i+divisor){
					primenum[i]=false;
				}
			}
		}
		return primenum;
	}
}