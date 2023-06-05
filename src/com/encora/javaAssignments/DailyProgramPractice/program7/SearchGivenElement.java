package com.encora.javaAssignments.DailyProgramPractice.program7;

public class SearchGivenElement {
    public static int search(int array[], int data, int mockData) {
        for (int index = 0; index < data; index++) {
            if (array[index] == mockData)
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 5};
        int arrayLength = array.length;
        int data = 4;
        int index = search(array, arrayLength, data);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}