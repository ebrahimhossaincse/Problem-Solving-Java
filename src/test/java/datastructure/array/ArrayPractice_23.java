package datastructure.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayPractice_23 {

	// Find the intersection of two arrays
	public static int[] findIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		set1.retainAll(set2);
		return set1.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 3, 8 };
		System.out.println("Intersection: " + Arrays.toString(findIntersection(arr1, arr2)));
	}
}
