package DailyProgramPractice.program10;

public class ConversionCharToInt {

    public static void main(String[] args){

        char characterValue = '3';
        System.out.println("char value: " + characterValue);
        int intValue = Integer.parseInt(String.valueOf(characterValue));
        System.out.println("int value: " + intValue);
    }
}