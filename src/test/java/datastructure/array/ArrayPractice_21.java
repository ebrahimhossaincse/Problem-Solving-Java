package datastructure.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayPractice_21 {

	// Find the difference between two arrays
	public static int[] findDifference(int[] arr1, int[] arr2) {
		Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		set1.removeAll(set2);
		return set1.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 3, 8 };
		System.out.println("Difference: " + Arrays.toString(findDifference(arr1, arr2)));
	}
}
