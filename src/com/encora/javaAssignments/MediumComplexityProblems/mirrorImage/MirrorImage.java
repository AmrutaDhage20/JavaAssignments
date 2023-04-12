package MediumComplexityProblems.mirrorImage;

public class MirrorImage {
    public static String mirrorEnds(String firstString) {
        int length = firstString.length();
        int half = length / 2;
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < half; index++) {
            if (firstString.charAt(index) != firstString.charAt(length - 1 - index)) {
                return result.toString();
            }
            result.append(firstString.charAt(index));
        }
        return firstString;
    }
    public static void main(String[] args) {
        String result1 = mirrorEnds("abXYZba");
        String result2 = mirrorEnds("abca");
        String result3 = mirrorEnds("aba");
        System.out.println("The mirrorEnd string is " + result1);
        System.out.println("The mirrorEnd string is " + result2);
        System.out.println("The mirrorEnd string is " + result3);
    }
}