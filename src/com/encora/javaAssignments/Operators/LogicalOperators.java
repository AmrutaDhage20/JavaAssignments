// Program using Logical Operators
package Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int waterBottles = 1;
        int quantity = 2;

        if ((waterBottles == 1) && (quantity == 2)) {
            System.out.println("Serial Number is 1 AND Quantity is 2");
        }
        if ((waterBottles == 1) || (quantity == 2)) {
            System.out.println("Serial Number is 1 OR Quantity is 2");
        }
    }
}