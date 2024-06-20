package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_15 {

	// Shift all elements of an array to the right
	public static void shiftRight(int[] arr) {
	    int last = arr[arr.length - 1];
	    for (int i = arr.length - 1; i > 0; i--) {
	        arr[i] = arr[i - 1];
	    }
	    arr[0] = last;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		shiftRight(array);
        System.out.println("Array after Right Shift: " + Arrays.toString(array));
	}
}
