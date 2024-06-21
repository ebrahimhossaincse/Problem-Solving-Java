package datastructure.array;

public class ArrayPractice_28 {

	// Implement linear search in an array.
	public static int linearSearch(int[] arr, int key) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == key) {
	            return i;
	        }
	    }
	    return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] arrToSort = { 5, 2, 10, 3, 1, 8, 9 };
		System.out.println("Linear Search (3): " + linearSearch(arrToSort, 3));
	}
}
