package org.arry;

import java.util.Arrays;

public class DemoThree {
	public static int removeDuplicateElement(int arr[]) {
		if (arr.length == 0 || arr.length == 1) {
			return arr.length;
		}

		// Create a new array to store the result
		int[] temp = new int[arr.length];
		int j = 0;

		// Iterate through the input array and check if the current element
		// is already present in the result array
		for (int num : arr) {
			boolean found = false;
			for (int i = 0; i < j; i++) {
				if (temp[i] == num) {
					found = true;
					break;
				}
			}
			if (!found) {
				temp[j++] = num;
			}
		}

		// Copy the result array back to the input array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 10, 20, 50, 60, 80, 60, 50 };

		// Sort the array to ensure that duplicates are next to each other
		Arrays.sort(arr);
		int length = removeDuplicateElement(arr);

		// Print the resulting array
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
