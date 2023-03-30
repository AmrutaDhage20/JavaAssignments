//Program using Unary Operators

package Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int output = +1;
        System.out.println(output);

        output--;
        System.out.println(output);

        output++;
        System.out.println(output);

        output = -output;
        System.out.println(output);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }
}