//Program using operators at PrePost

package Operators;

public class PrePostOperators {

    public static void main(String[] args) {

        int numberOfPens = 3;
        numberOfPens++;
        System.out.println(numberOfPens);

        ++numberOfPens;
        System.out.println(numberOfPens);
        System.out.println(++numberOfPens);
        System.out.println(numberOfPens++);
        System.out.println(numberOfPens);
    }
}