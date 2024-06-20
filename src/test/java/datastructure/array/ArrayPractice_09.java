package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_09 {

	// Reverse an array
	public static void reverseArray(int[] arr) {
	    int left = 0, right = arr.length - 1;
	    while (left < right) {
	        int temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;
	        left++;
	        right--;
	    }
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
	}
}
