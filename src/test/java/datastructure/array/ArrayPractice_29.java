package datastructure.array;

public class ArrayPractice_29 {

	// Find the second largest element in an array.
	public static int findSecondLargest(int[] arr) {
	    int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
	    for (int num : arr) {
	        if (num > first) {
	            second = first;
	            first = num;
	        } else if (num > second && num < first) {
	            second = num;
	        }
	    }
	    return second;
	}

	public static void main(String[] args) {
		int[] arrForSecondLargest = {1, 2, 3, 4, 5};
        System.out.println("Second Largest: " + findSecondLargest(arrForSecondLargest));
	}
}
