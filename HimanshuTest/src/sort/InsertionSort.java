package sort;

public class InsertionSort {
	static int[] arr = new int[] { 5, 2, 4, 6, 1, 3 };

	public static void main(String[] args) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && key < arr[i]) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		for (int num : arr) {
			System.out.println(num);
		}

	}

}
