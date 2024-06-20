package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_18 {

	// Rotate an array to the left by a given number of steps.
	public static void rotateLeft(int[] arr, int steps) {
	    steps = steps % arr.length;
	    reverse(arr, 0, steps - 1);
	    reverse(arr, steps, arr.length - 1);
	    reverse(arr, 0, arr.length - 1);
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
		rotateLeft(array, 2);
        System.out.println("Array after Left Rotate by 2: " + Arrays.toString(array));
	}
}
