package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_03 {

	// Copy all elements from one array to another.

	public static int[] copyArray(int[] arr) {
	    int[] copy = new int[arr.length];
	    System.arraycopy(arr, 0, copy, 0, arr.length);
	    return copy;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		int[] copiedArray = copyArray(array);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
	}

}
