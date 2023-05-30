package com.encora.javaAssignments.DailyProgramPractice.program7;

public class SearchGivenElement {
    public static int search(int array[], int firstNumber, int secondNumber) {
        for (int index = 0; index < firstNumber; index++) {
            if (array[index] == secondNumber)
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 5};
        int number = array.length;
        int numberTwo = 4;
        int index = search(array, number, numberTwo);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}