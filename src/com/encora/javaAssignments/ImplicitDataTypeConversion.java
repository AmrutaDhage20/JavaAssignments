//Program for Implicit Data Type Conversion
public class ImplicitDataTypeConversion {

    public static void main(String[] args) {

        int age = 50;
        //Prints the integer value stored in age variable
        System.out.println("Integer representation: " + age);

        long name = age;
        //Prints the long value stored at name
        System.out.println("Long representation: " + name);

        float city = name;
        //Prints the float value stored at city
        System.out.println("Float representation: " + city);
    }
}