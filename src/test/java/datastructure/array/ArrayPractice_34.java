package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_34 {

	// Concatenate two arrays.
	public static int[] concatenateArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 3, 6, 8 };
		System.out.println("Concatenated Array: " + Arrays.toString(concatenateArrays(arr1, arr2)));
	}
}
