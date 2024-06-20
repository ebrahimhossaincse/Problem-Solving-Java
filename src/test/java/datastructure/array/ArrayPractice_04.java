package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_04 {

	// Compare two arrays for equality.

	public static boolean arraysEqual(int[] arr1, int[] arr2) {
	    return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println("Arrays Equal: " + arraysEqual(array1, array2));
		
        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 2, 4};
        System.out.println("Arrays Equal: " + arraysEqual(array3, array4));
	}

}
