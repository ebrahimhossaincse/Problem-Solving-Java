package datastructure.array;

public class ArrayPractice_14 {

	// Count occurrences of a specific element in an array
	public static int countOccurrences(int[] arr, int value) {
	    int count = 0;
	    for (int num : arr) {
	        if (num == value) {
	            count++;
	        }
	    }
	    return count;
	}

	public static void main(String[] args) {
		int[] array = { 5, 3, 12, 3, 9, 3, 5, 7, 3 };
		System.out.println("Occurrences of 3: " + countOccurrences(array, 3));
	}
}
