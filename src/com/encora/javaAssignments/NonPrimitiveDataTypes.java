//Program for Non-Primitive data type
public class NonPrimitiveDataTypes {

    public static void main(String[] args) {

        String firstString = "Life is Beautiful";
        System.out.println("First String is:" + firstString);

        String secondString = new String("My Java Program");
        System.out.println("Second String is:" + secondString);

        int arrayAtIndex[];
        arrayAtIndex = new int[2];
        arrayAtIndex[0] = 0;
        arrayAtIndex[1] = 1;
        System.out.println("Array at Index 0 is:" + arrayAtIndex[0]);
        System.out.println("Array at Index 1 is:" + arrayAtIndex[1]);
    }
}