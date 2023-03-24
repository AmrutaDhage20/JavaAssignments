package Operators;

public class AssignmentOprator {
    public static void main (String[] args){

        int a = 200;
        int b = 20;

        //Assigning value of variable b to the variable a
        a = b;
        System.out.println("Output of a = b is "+a);

        // a = a+b
        a += b;
        System.out.println("Output of a = a+b is "+ a);

        // a = a-b
        a -= b;
        System.out.println("Output of a = a-b is "+ a);

        // a = a*b
        a *= b;
        System.out.println("Output of a = a*b is "+ a);

        // a = a/b
        a /= b;
        System.out.println("Output of a = a/b is "+ a);

        // a = a%b
        a %= b;
        System.out.println("Output of a = a%b is "+ a);
    }
}

