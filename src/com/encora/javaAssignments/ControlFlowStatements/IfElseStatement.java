package ControlFlowStatements;


public class IfElseStatement {

    //Program for IfElse statement:

    public static void checkEvenOdd(int marks) {

        if (marks % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(9);
        checkEvenOdd(2);
    }
}
