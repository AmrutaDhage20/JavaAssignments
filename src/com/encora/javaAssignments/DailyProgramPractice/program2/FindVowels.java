package DailyProgramPractice.program2;

public class FindVowels {
    //Write a Java method to count all vowels in a string.
    public static int count_Vowels(String string_One) {
        int count = 0;
        for (int index = 0; index < string_One.length(); index++) {
            switch (string_One.charAt(index)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String string_One = "i like Java soo much";
        System.out.print("Number of  Vowels in the string: " + count_Vowels(string_One) + "\n");
    }
}