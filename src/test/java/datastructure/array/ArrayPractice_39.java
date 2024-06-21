package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_39 {

	// Implement the Selection Sort algorithm.
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arrForSelectionSort = { 29, 10, 14, 37, 13 };
		selectionSort(arrForSelectionSort);
		System.out.println("Selection Sorted: " + Arrays.toString(arrForSelectionSort));
	}
}
