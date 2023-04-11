package MediumComplexityProblems.swappingArrayElement;

import java.util.Arrays;

public class SwappingArrayElement {
    public static boolean isPrime(int number) {
        int index;
        for (index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                return true;
            }
        }
        return false;
    }
    public static int[] swap(int[] array_one) {
        int temp = array_one[0];
        array_one[0] = array_one[array_one.length - 1];
        array_one[array_one.length - 1] = temp;
        return array_one;
    }
    public static void main(String[] args) {
        int[] array_one = {1, 2, 3, 7};
        boolean isPrime = isPrime(array_one[array_one.length - 1]);
        if (isPrime == false) {
            System.out.println("Original Array is: " + Arrays.toString(array_one));
            int arr[] = swap(array_one);
            System.out.println("Swapped array is: " + Arrays.toString(arr));
        } else {
            System.out.println("Not a prime number and original Array is: " + Arrays.toString(array_one));
        }
    }
}