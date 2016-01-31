package mergesort;

public class Merge_sort {

	public static void main(String[] args) {
		int A[]= new int[10];
		populateA(A);
		System.out.println("Before Sorting: ");
		printA(A);
		
		A = Merge_sort(A);
		
		System.out.println("\nAfter Sorting: ");
		printA(A);
	}

	public static int []Merge_sort(int[] B){
		if (B.length<=1){
			return B;
		}
		
		int midpoint = B.length/2;
		int[] left = new int [midpoint];
		int[] right;
		
		if(B.length%2==0){
			right = new int [midpoint];
		}
		else{
			right =new int [midpoint + 1];
		}
		
		int[] result= new int [B.length];
		
		for (int i=0;i<midpoint;i++){
			left[i] = B[i];
		}
		
		int x=0;
		for (int j=midpoint;j<B.length;j++){
			if (x<right.length){
				right[x] = B[j];
				x++;
			}
		}
		
		
		left=Merge_sort(left);
		
		

		right=Merge_sort(right);
		
		
		result=merge(left,right);
		
		return result;
	}
	
	public static int[] merge(int[] left,int[] right){
		int lengthResult= left.length + right.length;
		int[] result = new int [lengthResult];
		int indexL = 0;
		int indexR = 0;
		int indexRes = 0;
		
		while (indexL < left.length || indexR < right.length){
			if (indexL < left.length && indexR < right.length){
				if (left[indexL]<=right[indexR]){
					result[indexRes] = left[indexL];
					indexRes++;
					indexL++;
				}
				else{
					result[indexRes] = right[indexR];
					indexRes++;
					indexR++;
				}
			}
			
			else if (indexL < left.length){
				result[indexRes] = left[indexL];
				indexRes++;
				indexL++;
			}
			
			else if (indexR < right.length){
				result[indexRes] = right[indexR];
				indexRes++;
				indexR++;
			}
		}
		return result;
	}
	
	public static void printA(int [] B){
		for(int i=0;i<B.length;i++){
			System.out.print(B[i] + " ");
		}
	}
	
	public static int[] populateA(int[] B){
		for(int i=0;i<B.length;i++){
			B[i] = (int) (Math.random()*100);
		}
		return B;
	}
}
