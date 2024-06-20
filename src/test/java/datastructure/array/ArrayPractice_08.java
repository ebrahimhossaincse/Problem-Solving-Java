package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_08 {

	// Insert an element at a specific position in an array.
	public static int[] insertElement(int[] arr, int value, int position) {
		int[] result = new int[arr.length + 1];
		for (int i = 0, j = 0; i < result.length; i++) {
			if (i == position) {
				result[i] = value;
			} else {
				result[i] = arr[j++];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		int[] insertedArray = insertElement(array, 10, 2);
		System.out.println("Array after Inserting 10 at index 2: " + Arrays.toString(insertedArray));

	}
}
