package datastructure.array;

public class ArrayPractice_13 {

	// Calculate the average of all elements in an array
	public static double findAverage(int[] arr) {
		int sum = 0;
	    for (int num : arr) {
	        sum += num;
	    }
	    return (double) sum / arr.length;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 12, 3, 9, 25 };
		System.out.println("Average of Elements: " + findAverage(array));
	}
}
