package MediumComplexityProblems.employeeTax;

import java.util.Scanner;

public class EmployeeTax {

    /* Java program to calculate income tax */

    public static void calculateIncomeTax(double salary) {

        double taxableAmount = 0;
        int taxSlab = 0;
        double tax = 0;

        taxSlab = (salary > 700000 && salary <= 1000000) ? 2 : (salary > 1000000 && salary <= 1500000) ? 3 : (salary > 1500000) ? 4 : 1;
        System.out.println("taxSlab: " + taxSlab);

        taxableAmount = salary - 500000;
        System.out.println("Total Taxable Amount:" + taxableAmount);

        switch (taxSlab) {

            case 1:
                System.out.println("Tax Free");
                break;
            case 2:
                tax = (0.15 * (salary - 700000)) + (0.10 * 200000);
                break;
            case 3:
                tax = (0.20 * (salary - 1000000)) + (0.15 * 300000) + (0.10 * 200000);
                break;
            case 4:
                tax = (0.30 * (salary - 1500000)) + (0.20 * 500000) + (0.15 * 300000) + (0.10 * 200000);
                break;
        }
        System.out.println("Total IncomeTax is: " + (tax));
    }

    public static void main(String[] args) {

        calculateIncomeTax(1200000);
    }
}