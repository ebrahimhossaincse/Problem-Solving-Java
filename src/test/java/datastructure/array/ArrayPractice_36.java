package datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPractice_36 {

	// Find the duplicate elements in an array.
	public static int[] findDuplicates(int[] arr) {
		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		for (int num : arr) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}
		return duplicates.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arrForDuplicates = { 1, 2, 3, 2, 4, 3 };
		System.out.println("Duplicates: " + Arrays.toString(findDuplicates(arrForDuplicates)));

	}
}
