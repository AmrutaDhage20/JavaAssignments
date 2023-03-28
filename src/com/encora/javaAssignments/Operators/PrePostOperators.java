//Program using operators at PrePost
package Operators;
public class PrePostOperators {

    public static void main(String[] args){

        int code=3;
        code++;
        System.out.println(code);//print 4
        ++code;
        System.out.println(code);//print 5
        System.out.println(++code);//print 6
        System.out.println(code++);//print 6
        System.out.println(code);//print 7
    }
}
