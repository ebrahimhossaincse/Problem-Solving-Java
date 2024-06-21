package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_25 {

	// Sort an array in ascending order
	public static void sortAscending(int[] arr) {
	    Arrays.sort(arr);
	}

	public static void main(String[] args) {
		int[] arrToSort = {5, 2, 10, 8, 3, 1};
        sortAscending(arrToSort);
        System.out.println("Sorted in Ascending: " + Arrays.toString(arrToSort));
	}
}
