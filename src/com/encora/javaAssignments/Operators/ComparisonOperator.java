//Program using Comparison Operators
package Operators;
public class ComparisonOperator {
    public static void main (String[] args){
        int weightOfJoy = 100;
        int weightOfTina = 50;

        // if weightOfJoy is equal to weightOfTina then it returns true
        System.out.println("weightOfJoy == weightOfTina = " + (weightOfJoy == weightOfTina) );
        // if weightOfJoy is not equal to weightOfTina then it returns true
        System.out.println("weightOfJoy != weightOfTina = " + (weightOfJoy != weightOfTina) );
        // if weightOfJoy is greater than weightOfTina then it returns true
        System.out.println("weightOfJoy > weightOfTina = " + (weightOfJoy > weightOfTina) );
        // if weightOfJoy is less than weightOfTina then it returns true
        System.out.println("weightOfJoy < weightOfTina = " + (weightOfJoy < weightOfTina) );
        // if weightOfJoy is greater than or equal to weightOfTina then it returns true
        System.out.println("weightOfJoy >= weightOfTina = " + (weightOfJoy >= weightOfTina) );
        // if weightOfJoy is less than or equal to weightOfTina then it returns true
        System.out.println("weightOfJoy <= num2 = " + (weightOfJoy <= weightOfTina) );
    }
}