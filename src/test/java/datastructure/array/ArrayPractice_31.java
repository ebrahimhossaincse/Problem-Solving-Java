package datastructure.array;

public class ArrayPractice_31 {

	// Check if an array is sorted in ascending order.
	public static boolean isSortedAscending(int[] arr) {
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] < arr[i - 1]) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		int[] arrToSort = { 5, 4, 3, 2, 1 };
		System.out.println("Is Sorted Ascending: " + isSortedAscending(arrToSort));
		
		int[] arrToSort2 = { 1, 2, 3, 4, 5 };
		System.out.println("Is Sorted Descending: " + isSortedAscending(arrToSort2));
	}
}
