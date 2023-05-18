package com.encora.javaAssignments.DailyProgramPractice.program7;

public class program7 {

    //Given an array arr[] of n elements, write a function to search a given element x in arr[].

    class LinearSearch {
        static int search(int array[], int number, int numberTwo) {
            for (int index = 0; index < number; index++) {
                if (array[index] == numberTwo)
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
}