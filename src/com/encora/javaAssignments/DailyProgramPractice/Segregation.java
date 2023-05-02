package DailyProgramPractice;
import java.util.*;
import java.lang.*;

public class Segregation {

    //Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.

    public static void main(String[] args) {
        int numbers[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int numbersSize = numbers.length;
        int left = 0, right = numbersSize - 1;
        System.out.println("Original Array : " + Arrays.toString(numbers));
        while (left < right) {
            while (numbers[left] == 0 && left < right)
                left++;
            while (numbers[right] == 1 && left < right)
                right--;
            if (left < right) {
                numbers[left] = 0;
                numbers[right] = 1;
                left++;
                right--;
            }
        }
        System.out.println("Array after segregation is : " + Arrays.toString(numbers));
    }
}