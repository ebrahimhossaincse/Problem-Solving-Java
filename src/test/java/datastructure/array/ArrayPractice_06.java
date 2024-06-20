package datastructure.array;

public class ArrayPractice_06 {

	// Check if an array contains a specific value.
	public static boolean containsValue(int[] arr, int value) {
		for (int num : arr) {
			if (num == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		System.out.println("Contains 2: " + containsValue(array, 2));
		System.out.println("Contains 3: " + containsValue(array, 3));
	}

}
