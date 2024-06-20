package datastructure.array;

public class ArrayPractice_10 {

	// Find the maximum element in an array
	public static int findMax(int[] arr) {
	    int max = arr[0];
	    for (int num : arr) {
	        if (num > max) {
	            max = num;
	        }
	    }
	    return max;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 12, 34, 9, 25 };
		System.out.println("Maximum Element: " + findMax(array));
	}
}
