package datastructure.array;

import java.util.Arrays;

public class ArrayPractice_35 {

	// Find the missing number in an array of 1 to N.
	public static int findMissingNumber(int[] arr, int N) {
		int expectedSum = N * (N + 1) / 2;
		int actualSum = Arrays.stream(arr).sum();
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		int[] arrForMissingNumber = { 1, 2, 3, 4, 6, 7, 8 };
		System.out.println("Missing Number: " + findMissingNumber(arrForMissingNumber, 8));

	}
}
