package datastructure.array;

public class ArrayPractice_10 {

	// Find the minimum element in an array
	public static int findMin(int[] arr) {
	    int min = arr[0];
	    for (int num : arr) {
	        if (num < min) {
	            min = num;
	        }
	    }
	    return min;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 12, 3, 9, 25 };
		System.out.println("Minimum Element: " + findMin(array));
	}
}
