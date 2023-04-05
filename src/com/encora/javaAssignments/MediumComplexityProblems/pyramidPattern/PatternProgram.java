package MediumComplexityProblems;

public class PatternProgram {

    public static void printPattern(int patternLimit) {
        for (int index = 1; index <= patternLimit; index++) {
            for (int spaceIndex = patternLimit - index; spaceIndex >= 1; spaceIndex--) {
                System.out.print(" ");
            }
            for (int leftIntIndex = index; 1 <= leftIntIndex; leftIntIndex--) {
                System.out.print(leftIntIndex);
            }
            for (int rightIntIndex = 2; rightIntIndex <= index; rightIntIndex++) {
                System.out.print(rightIntIndex);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printPattern(4);
    }
}