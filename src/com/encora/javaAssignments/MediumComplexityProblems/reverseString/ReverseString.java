package MediumComplexityProblems.reverseString;

public class ReverseString {
    // Program to reverse the string without changing the position of special character
    public static String stringReverse(String myString) {
        StringBuilder str = new StringBuilder(myString);
        StringBuilder reverse = new StringBuilder();
        int position = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '@') {
                reverse.insert(0, str.charAt(i));
            } else {
                position = i;
                System.out.println(i);
            }
        }
        if (position != -1) {
            reverse.insert(position, '@');
        }
        System.out.println(reverse.toString());
        return reverse.toString();
    }
    public static void main(String[] args) {
        String myString = stringReverse("Ro@hitshetty");
    }
}