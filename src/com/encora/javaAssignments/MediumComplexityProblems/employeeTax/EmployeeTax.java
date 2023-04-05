package MediumComplexityProblems.employeeTax;

public class EmployeeTax {

    /* Java program to calculate income tax */

    public static void main(String args[]) {

        double income = 2000000, tax = 0;
        double taxableAmount = 0;
        double taxFor10Percent = 0, taxFor15Percent = 0, taxFor20Percent = 0, taxFor30Percent = 0;
        double totalTax;

        if (income <= 700000) {
            tax = 0;
        } else {
            taxableAmount = income - 500000;
            System.out.println("Total Taxable Amount:" + taxableAmount);

            taxFor10Percent = 0.1 * 200000;
            System.out.println("taxFor10Percent: " + taxFor10Percent);
            if (income <= 1000000) {
                taxFor15Percent = (0.15 * (taxableAmount - 200000));
                System.out.println("taxFor15Percent: " + taxFor15Percent);
            }
            if (income > 1000000 && income <= 1500000) {
                taxFor15Percent = 0.15 * 300000;
                taxFor20Percent = (0.20 * (taxableAmount - 300000 - 200000));
                System.out.println("taxFor15Percent: " + taxFor15Percent);
                System.out.println("taxFor20Percent: " + taxFor20Percent);
            }
            if (income > 1500000) {
                taxFor15Percent = 0.15 * 300000;
                taxFor20Percent = 0.20 * 500000;
                taxFor30Percent = (0.30 * (taxableAmount - 300000 - 200000 - 500000));
                System.out.println("taxFor15Percent: " + taxFor15Percent);
                System.out.println("taxFor20Percent: " + taxFor20Percent);
                System.out.println("taxFor30Percent: " + taxFor30Percent);
            }
        }
        totalTax = taxFor10Percent + taxFor15Percent + taxFor20Percent + taxFor30Percent;
        System.out.println("Total IncomeTax is: " + totalTax);
    }
}