package ControlFlowStatements;

public class IfStatement {

    //Program for If Statement:

    public static void student(int rank) {

        if (rank < 0) {
            System.out.println("The number is Negative");
        }
        System.out.println("The number is Positive");
    }

    public static void main(String[] args) {
        student(100);
        student(0);
        student(-1);
    }
}