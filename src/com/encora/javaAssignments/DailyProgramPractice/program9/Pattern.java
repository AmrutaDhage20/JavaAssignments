package DailyProgramPractice.program9;

import java.util.Arrays;

public class Pattern {
    public static void insertionSort(int[] unsorted) {
        for (int index = 1; index < unsorted.length; index++) {
            int current = unsorted[index];
            int nextIndex = index;
            while (nextIndex > 0 && unsorted[nextIndex - 1] > current) {
                unsorted[nextIndex] = unsorted[nextIndex - 1];
                nextIndex--;
            }
            unsorted[nextIndex] = current;
        }
    }

    public static void main(String args[]) {
        int[] unsorted = {32, 23, 45, 87, 92, 31, 19};
        System.out.println("integer array before sorting : " + Arrays.toString(unsorted));
        insertionSort(unsorted);
        System.out.println("integer array after sorting : " + Arrays.toString(unsorted));
    }
}