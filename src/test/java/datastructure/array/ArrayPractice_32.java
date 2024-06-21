package datastructure.array;

public class ArrayPractice_32 {

	// Check if an array is sorted in descending order.
	public static boolean isSortedDescending(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arrToSort = { 5, 4, 3, 2, 1 };
		System.out.println("Is Sorted Descending: " + isSortedDescending(arrToSort));
		
		int[] arrToSort2 = { 5, 3, 4, 2, 1 };
		System.out.println("Is Sorted Descending: " + isSortedDescending(arrToSort2));
	}
}
