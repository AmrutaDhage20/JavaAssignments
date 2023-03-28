//Program using Unary Operators

package Operators;
public class UnaryOperators {

    public static void main(String[] args){

        int output = +1;//output is now 1
        System.out.println(output);

        output--;//output is zero
        System.out.println(output);

        output++;//output is now 1
        System.out.println(output);

        output=-output;//result is now -1
        System.out.println(output);

        boolean success = false; //false
        System.out.println(success);
        System.out.println(!success);//true
    }
}
