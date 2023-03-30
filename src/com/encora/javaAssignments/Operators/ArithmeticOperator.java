//Addition, subtraction, multiplication, division, modulus of two integers
package Operators;

public class ArithmeticOperator {

    public static void main(String[] args) {

        int mathsScore = 2000;
        int englishScore = 500;
        System.out.println("Addition of two subjects:" + (mathsScore + englishScore));
        System.out.println("Subtraction of two subjects is:" + (mathsScore - englishScore));
        System.out.println("Multiplication of two subjects is:" + (mathsScore * englishScore));
        System.out.println("Division of two subjects is:" + (mathsScore / englishScore));
        System.out.println("Modulus of two subjects is:" + (mathsScore % englishScore));
    }
}