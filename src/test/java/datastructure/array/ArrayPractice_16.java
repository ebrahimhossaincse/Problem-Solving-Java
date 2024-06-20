package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_16 {

	// Shift all elements of an array to the left
	public static void shiftLeft(int[] arr) {
	    int first = arr[0];
	    for (int i = 0; i < arr.length - 1; i++) {
	        arr[i] = arr[i + 1];
	    }
	    arr[arr.length - 1] = first;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		shiftLeft(array);
        System.out.println("Array after Left Shift: " + Arrays.toString(array));
	}
}
