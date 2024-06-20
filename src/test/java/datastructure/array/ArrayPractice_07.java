package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_07 {

	// Remove a specific element from an array.
	public static int[] removeElement(int[] arr, int value) {
		return Arrays.stream(arr).filter(num -> num != value).toArray();
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		int[] removedArray = removeElement(array, 2);
		System.out.println("Array after Removing 2: " + Arrays.toString(removedArray));
	}
}
