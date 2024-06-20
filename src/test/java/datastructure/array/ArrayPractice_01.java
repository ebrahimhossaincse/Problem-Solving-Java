package datastructure.array;

public class ArrayPractice_01 {

	// Find the length of an array.

	public static int getArrayLength(int[] arr) {
		return arr.length;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		System.out.println("Array length: " + getArrayLength(array));
	}

}
