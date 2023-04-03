// Program for IfElseIf Statement:

package ControlFlowStatements;

public class IfElseIfStatement {

    public static void main(String[] args) {

        int marks = 76;
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
}
