package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		return new int[positions];

	}

	public static String[] createInitializedStringArray() {
		String[] array = new String[3];
		array[0] = "1";
		array[1] = "2";
		array[2] = "3";
		return array;
	}

	public static void populateArray(int[] array, int index, int value) {
		if (index >= 0 && index < array.length) {
			array[index] = value;
		} else {
			System.out.println("Index out of bounds");
		}
	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		if (index >= 0 && index < array.length) {
			System.out.println(array[index]);
		} else {
			System.out.println("Index out of bounds");
		}
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
