package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_24 {

	// Remove duplicates from an array.
	public static int[] removeDuplicates(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}

	public static void main(String[] args) {
		int[] arrWithDuplicates = { 1, 2, 2, 3, 4, 4, 5 };
		System.out.println("Array without Duplicates: " + Arrays.toString(removeDuplicates(arrWithDuplicates)));
	}
}
