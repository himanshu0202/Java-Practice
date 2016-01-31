package first;
import java.io.*;
import java.util.Scanner;
class Solution{
	public static void main(String[] args) throws IOException{
		int finalTriangle[][];
		Solution s=new Solution();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		finalTriangle=s.pascalTriangle(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(finalTriangle[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static int[][] pascalTriangle(int n){
		int[][] triangle=new int[n][];
		for (int i=0;i<n;i++){
			triangle[i]=new int[i+1];
			triangle[i][0]=1;
			triangle[i][i]=1;
			for(int j=1;j<i;j++){
				triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
			}
		}
		return triangle;
	}
}

