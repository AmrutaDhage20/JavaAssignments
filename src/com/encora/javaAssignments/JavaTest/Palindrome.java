package JavaTest;

public class Palindrome {

   /* Palindrome by swapping only one character
    Input : bbg
    Output : true
    Explanation: Swap b(1st index) with g.
    Input : bdababd
    Output : true
    Explanation: Swap b(0th index) with d(last index) or
    Swap d(1st index) with b(second index)
    Input : gcagac
    Output : false
    */
//palindrom function,

    public static String swapCharacter(String s) {
        StringBuilder sb = new StringBuilder(s);
        char firstChar = s.charAt(1);
        char lastChar = s.charAt(sb.length() - 1);
        sb.replace(1, sb.length() - 1, Character.toString(lastChar));
        sb.replace(sb.length() - 1, sb.length(), Character.toString(firstChar));
        return sb.toString();
    }
    public static boolean isPalindrome(String s) {
        StringBuilder reverse = new StringBuilder();
        int position = -1;
        for (int i = 0; i < s.length(); i++) {
            reverse.insert(0, s.charAt(i));
        }
        System.out.println(s);
        System.out.println(reverse.toString());
        return s.equals(reverse.toString());
    }
    public static void main(String[] args) {
        String swappedString;
        String string = ("bbg");
        swappedString = swapCharacter(string);
        System.out.println(isPalindrome(swappedString));
    }
}