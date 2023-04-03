//Program using Ternary Operator

package ControlFlowStatements;

public class TernaryOperator {

    public static void main(String[] args) {

        int ageOfPiyu = 12;
        int ageOfDaksh = 16;
        int result;

        result = ageOfPiyu > ageOfDaksh ? ageOfPiyu : ageOfDaksh;
        System.out.println(result);
    }
}