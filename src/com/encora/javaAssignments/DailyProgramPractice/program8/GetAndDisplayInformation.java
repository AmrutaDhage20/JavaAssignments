package program8;

import java.util.Calendar;

public class GetAndDisplayInformation {

    public static void main(String[] args)
    {
        Calendar calculator = Calendar.getInstance();
        System.out.println();
        System.out.println("Year: " + calculator.get(Calendar.YEAR));
        System.out.println("Month: " + calculator.get(Calendar.MONTH));
        System.out.println("Day: " + calculator.get(Calendar.DATE));
        System.out.println("Hour: " + calculator.get(Calendar.HOUR));
        System.out.println("Minute: " + calculator.get(Calendar.MINUTE));
        System.out.println();
    }
}