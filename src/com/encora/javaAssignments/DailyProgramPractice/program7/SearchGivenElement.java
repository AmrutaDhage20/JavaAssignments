package com.encora.javaAssignments.DailyProgramPractice.program7;

public class SearchGivenElement {
    public static int search(int array[], int firstArray, int secondArray) {
        for (int index = 0; index < firstArray; index++) {
            if (array[index] == secondArray)
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 5};
        int arrayLength = array.length;
        int number = 4;
        int index = search(array, arrayLength, number);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}