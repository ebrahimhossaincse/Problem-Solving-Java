package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_19 {

	// Merge two arrays into a single array
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		return merged;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 3, 6, 8 };
		System.out.println("Merged Array: " + Arrays.toString(mergeArrays(arr1, arr2)));
	}
}
