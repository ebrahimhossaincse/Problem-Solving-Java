package datastructure.array;

public class ArrayPractice_12 {

	// Calculate the sum of all elements in an array
	public static int sumArray(int[] arr) {
	    int sum = 0;
	    for (int num : arr) {
	        sum += num;
	    }
	    return sum;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 12, 3, 9, 25 };
		System.out.println("Sum of Elements: " + sumArray(array));
	}
}
