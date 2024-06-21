package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_41 {

	// Implement the Insertion Sort algorithm.
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arrForInsertionSort = { 22, 11, 99, 88, 9, 7, 42 };
		insertionSort(arrForInsertionSort);
		System.out.println("Insertion Sorted: " + Arrays.toString(arrForInsertionSort));
	}
}
