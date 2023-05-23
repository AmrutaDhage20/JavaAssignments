package DailyProgramPractice.program4;

import java.util.Arrays;

public class MergeTwoArrays {

    //Java Program to Merge Two Arrays

    public static void main(String[] args) {
        int[] firstArray = {15, 23, 35, 42};
        int[] secondArray = {55, 61, 77, 84};
        int firstArray_1 = firstArray.length;
        int secondArray_1 = secondArray.length;
        int wholeArray = firstArray_1 + secondArray_1;
        int[] result = new int[wholeArray];
        System.arraycopy(firstArray, 0, result, 0, firstArray_1);
        System.arraycopy(secondArray, 0, result, firstArray_1, secondArray_1);
        System.out.println(Arrays.toString(result));
    }
}