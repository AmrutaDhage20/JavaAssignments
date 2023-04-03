package ControlFlowStatements;

public class NestedIfDemo {

    // Program using NestedIf :

    public static void compareNumbers(int integerNumber) {
        // int integerNumber = 50;
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

    public static void main(String[] args) {
        compareNumbers(50);
        compareNumbers(70);
        compareNumbers(40);
    }
}
