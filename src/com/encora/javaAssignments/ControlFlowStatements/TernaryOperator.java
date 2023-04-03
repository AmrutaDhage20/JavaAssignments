package ControlFlowStatements;

public class TernaryOperator {

    //Program using Ternary Operator

    static void compareAge(int ageOfPiyu, int ageOfDaksh) {
        System.out.println(ageOfPiyu > ageOfDaksh ? ageOfPiyu : ageOfDaksh);
    }

    public static void main(String[] args) {
        compareAge(12, 20);
        compareAge(200, 20);
        compareAge(399, 199);
        compareAge(120, 999);
        compareAge(111, 1001);
    }
}