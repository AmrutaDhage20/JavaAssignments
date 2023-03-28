//Program using Assignment Operators
package Operators;
public class AssignmentOperator{

    public static void main (String[] args){

        int femaleEmployee = 100;
        int maleEmployee = 20;

        //Assigning value of variable maleEmployee to the variable femaleEmployee
        femaleEmployee = maleEmployee;
        System.out.println("Value of variable femaleEmployee is " +femaleEmployee);

        // Addition
        femaleEmployee += maleEmployee;
        System.out.println("Addition of total Employees are " +femaleEmployee);

        // Subtraction
        femaleEmployee -= maleEmployee;
        System.out.println("Subtraction of total Employees is " +femaleEmployee);

        // Multiplication
        femaleEmployee *= maleEmployee;
        System.out.println("Multiplication of total Employees is " +femaleEmployee);

        // Division
        femaleEmployee /= maleEmployee;
        System.out.println("Division of total Employees is " +femaleEmployee);

        // Modulus
        femaleEmployee %= maleEmployee;
        System.out.println("Modulus of total Employees is " +femaleEmployee);
    }
}