package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_26 {

	// Sort an array in descending order.
	public static void sortDescending(int[] arr) {
	    Arrays.sort(arr);
	    for (int i = 0; i < arr.length / 2; i++) {
	        int temp = arr[i];
	        arr[i] = arr[arr.length - 1 - i];
	        arr[arr.length - 1 - i] = temp;
	    }
	}

	public static void main(String[] args) {
		int[] arrToSortDesc = {5, 2, 8, 3, 1};
        sortDescending(arrToSortDesc);
        System.out.println("Sorted in Descending: " + Arrays.toString(arrToSortDesc));
	}
}
