package datastructure.array;

public class ArrayPractice_02 {

	// Access the first and last element of an array.

	public static void printFirstAndLast(int[] arr) {
		if (arr.length > 0) {
			System.out.println("First element: " + arr[0]);
			System.out.println("Last element: " + arr[arr.length - 1]);
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		System.out.print("First and Last Element: ");
		printFirstAndLast(array);
	}

}
