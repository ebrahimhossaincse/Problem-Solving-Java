package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_17 {

	// Rotate an array to the right by a given number of steps
	public static void rotateRight(int[] arr, int steps) {
		steps = steps % arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, steps - 1);
		reverse(arr, steps, arr.length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		rotateRight(array, 3);
		System.out.println("Array after Right Rotate by 2: " + Arrays.toString(array));
	}
}
