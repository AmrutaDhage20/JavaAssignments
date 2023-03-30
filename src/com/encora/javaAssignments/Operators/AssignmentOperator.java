//Program using Assignment Operators
package Operators;

public class AssignmentOperator {

    public static void main(String[] args) {

        int femaleEmployeeCount = 100;
        int maleEmployeeCount = 20;

        femaleEmployeeCount = maleEmployeeCount;
        System.out.println("Value of variable femaleEmployee is " + femaleEmployeeCount);

        femaleEmployeeCount += maleEmployeeCount;
        System.out.println("Addition of Employees are " + femaleEmployeeCount);

        femaleEmployeeCount -= maleEmployeeCount;
        System.out.println("Subtraction of Employees is " + femaleEmployeeCount);

        femaleEmployeeCount *= maleEmployeeCount;
        System.out.println("Multiplication of Employees is " + femaleEmployeeCount);

        femaleEmployeeCount /= maleEmployeeCount;
        System.out.println("Division of Employees is " + femaleEmployeeCount);

        femaleEmployeeCount %= maleEmployeeCount;
        System.out.println("Modulus of total Employees is " + femaleEmployeeCount);
    }
}