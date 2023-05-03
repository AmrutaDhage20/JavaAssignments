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
        String string_One = "I like Java soo much";
        String lower = string_One.toLowerCase();
        System.out.println("input String before converting to LowerCase : " + string_One);
        System.out.println("output String after converting to LowerCase : " + lower);
        System.out.print("Number of  Vowels in the string: " + count_Vowels(lower) + "\n");
    }
}