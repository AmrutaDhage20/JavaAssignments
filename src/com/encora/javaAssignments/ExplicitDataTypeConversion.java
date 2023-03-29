//Program using Explicit Data Type:

public class ExplicitDataTypeConversion {

    double doubleNumber = 50.50;

    void conversion() {

        float floatNumber = (float) doubleNumber;
        long longNumber = (long) doubleNumber;
        int integerNumber = (int) longNumber;

        System.out.println("Double representation: " + doubleNumber);
        System.out.println("Float representation: " + floatNumber);
        System.out.println("Long representation: " + longNumber);
        System.out.println("Integer representation: " + integerNumber);
    }

    public static void main(String[] args) {

        ExplicitDataTypeConversion obj = new ExplicitDataTypeConversion();
        obj.conversion();

    }
}
