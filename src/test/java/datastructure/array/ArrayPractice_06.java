package datastructure.array;

public class ArrayPractice_06 {

	// Find the index of a specific element in an array.
	public static int findIndex(int[] arr, int value) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == value) {
	            return i;
	        }
	    }
	    return -1;
	}


	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		System.out.println("Index of 2: " + findIndex(array, 2));
		System.out.println("Index of 11: " + findIndex(array, 11));
	}

}
