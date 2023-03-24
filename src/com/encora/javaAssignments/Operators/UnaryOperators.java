package Operators;

public class UnaryOperators {
    public static void main(String[] orgs){
        int result = +1;//result is now 1
        System.out.println(result);

        result--;//result is zero
        System.out.println(result);

        result++;//result is now 1
        System.out.println(result);

        result=-result;//result is now -1
        System.out.println(result);

        boolean success = false; //false
        System.out.println(success);
        System.out.println(!success);//true
    }
}
