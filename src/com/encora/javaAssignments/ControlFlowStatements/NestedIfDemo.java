// Program using NestedIf :
package ControlFlowStatements;

public class NestedIfDemo {

    public static void main(String[] args) {

        int integerNumber = 50;
        if (integerNumber == 50) {
            System.out.println("IntegerNumber is 50");
            if (integerNumber < 75) {
                System.out.println("IntegerNumber is smaller that 75");
                if (integerNumber < 55) {
                    System.out.println("IntegerNumber is also smaller than 55");
                }
            }
        }
    }
}
