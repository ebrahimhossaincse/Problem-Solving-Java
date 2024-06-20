package datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPractice_22 {

	// Find the union of two arrays
	public static int[] findUnion(int[] arr1, int[] arr2) {
	    Set<Integer> set = new HashSet<Integer>();
	    for (int num : arr1) {
	        set.add(num);
	    }
	    for (int num : arr2) {
	        set.add(num);
	    }
	    return set.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 3, 8 };
		 System.out.println("Union: " + Arrays.toString(findUnion(arr1, arr2)));

	}
}
