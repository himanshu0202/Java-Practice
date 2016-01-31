package selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int A[]=new int[10];
		populateA(A);
		System.out.println("Array before sorting" + " ");
		printA(A);
		A=selectionSort(A);
		System.out.println("Sorted Array" + " ");
		printA(A);

	}
	
	public static int[] populateA(int B[]){
		for(int i=0; i<B.length;i++){
			B[i] = (int) (Math.random()*100);
		}
		return B;
	}
	
	public static int[] selectionSort(int B[]){
		for(int j = 0;j<B.length;j++){
			int smallest = j;
			for(int i=j+1;i<B.length;i++){
				if (B[i] < B[smallest]){
					smallest= i;
				}
			}
			int t = B[j];
			B[j] = B[smallest];
			B[smallest] = t;
		}
		return B;
	}
	
	public static void printA(int[] B){
		for(int i=0; i<B.length;i++){
			System.out.println(B[i]+ " ");
		}
	}
}
