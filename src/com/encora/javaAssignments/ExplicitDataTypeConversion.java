//Program using Explicit Data Type:
public class ExplicitDataTypeConversion {

    public static void main(String[] args) {

        double doubleNumber = 50.50;
        System.out.println("Double representation: " + doubleNumber);
        float floatNumber = (float) doubleNumber;
        System.out.println("Float representation: " + floatNumber);
        long longNumber = (long) doubleNumber;
        System.out.println("Long representation: " + longNumber);
        int integerNumber = (int) longNumber;
        System.out.println("Integer representation: " + integerNumber);
    }
}
