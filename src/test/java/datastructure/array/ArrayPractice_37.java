package datastructure.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayPractice_37 {

	// Find the frequency of each element in an array
	public static Map<Integer, Integer> frequencyCount(int[] arr) {
		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		return freqMap;
	}

	public static void main(String[] args) {
		int[] arrForDuplicates = { 1, 2, 3, 2, 4, 3 };
		System.out.println("Frequency Count: " + frequencyCount(arrForDuplicates));

	}
}
