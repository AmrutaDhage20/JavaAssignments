package DailyProgramPractice.program5;

public class ReverseCharacters {

    // Reverse all the characters by using Swapping.

    public static void main(String[] args) {
        String stringOne = "ECITCARP AVAJ SI SIHT";
        char[] array = stringOne.toCharArray();
        int index, length = 0;
        length = array.length - 1;
        for (index = 0; index < length; index++, length--) {
            char temp = array[index];
            array[index] = array[length];
            array[length] = temp;
        }
        for (char chars : array)
            System.out.print(chars);
        System.out.println();
    }
}