package ControlFlowStatements;

public class IfStatement {

    //Program for If Statement:

    public static void student(int rank) {
        if (rank < 0) {
            System.out.println("The number is Negative");
        }
        if (rank > 0) {
            System.out.println("The number is Positive");
        }
        if (rank == 0) {
            System.out.println("The number is Neutral");
        }
    }

    public static void main(String[] args) {
        student(-1);
        student(2);
        student(0);
    }
}