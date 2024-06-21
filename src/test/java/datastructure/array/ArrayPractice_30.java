package datastructure.array;

public class ArrayPractice_30 {

	// Find the second smallest element in an array.
	public static int findSecondSmallest(int[] arr) {
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < first) {
				second = first;
				first = num;
			} else if (num < second && num > first) {
				second = num;
			}
		}
		return second;
	}

	public static void main(String[] args) {
		int[] arrForSecondSmallest = { 5, 4, 3, 2, 1 };
		System.out.println("Second Smallest: " + findSecondSmallest(arrForSecondSmallest));

	}
}
