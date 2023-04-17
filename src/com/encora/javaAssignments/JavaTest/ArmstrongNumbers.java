package JavaTest;

public class ArmstrongNumbers {
    // Print The Armstrong Number between Two Integers
    //  calculate the number of digits in a number
    // check if a number is an Armstrong number
    // Loop through all the numbers between the start and end integers
    //PrintArmStrong number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static boolean isArmstrong(int numberOne) {
        int originalNum = numberOne;
        int length = countDigits(numberOne);
        int total = 0;
        while (numberOne != 0) {
            int digit = numberOne % 10;
            total += Math.pow(digit, length);
            numberOne /= 10;
        }
        return total == originalNum;
    }
    public static void printArmstrongNumbers(int start, int end) {
        for (int index = start; index <= end; index++) {
            if (isArmstrong(index)) {
                System.out.println(index);
            }
        }
    }
    public static void main(String[] args) {
        int start = 50;
        int end = 500;
        printArmstrongNumbers(start, end);
    }
}