package datastructure.array;

public class ArrayPractice_27 {

	// Implement binary search in a sorted array.
	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] arrToSort = { 5, 2, 10, 3, 1, 8, 9 };
		System.out.println("Binary Search (8): " + binarySearch(arrToSort, 8));
	}
}
