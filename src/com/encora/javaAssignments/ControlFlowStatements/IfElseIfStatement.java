package ControlFlowStatements;

public class IfElseIfStatement {

    // Program for IfElseIf Statement:

    static void result(int marks) {

        char grade;
        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

    public static void main(String[] args) {
        result(50);
        result(60);
        result(70);
        result(80);
    }
}

