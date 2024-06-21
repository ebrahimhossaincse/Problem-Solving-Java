package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_33 {

	// Split an array into two parts.
	public static int[][] splitArray(int[] arr, int index) {
		int[] part1 = Arrays.copyOfRange(arr, 0, index);
		int[] part2 = Arrays.copyOfRange(arr, index, arr.length);
		return new int[][] { part1, part2 };
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1 };
		int[][] splitResult = splitArray(array, 3);
		System.out
				.println("Split Array: " + Arrays.toString(splitResult[0]) + " and " + Arrays.toString(splitResult[1]));

	}
}
