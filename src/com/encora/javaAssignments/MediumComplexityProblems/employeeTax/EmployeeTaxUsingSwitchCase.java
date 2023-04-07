package MediumComplexityProblems.employeeTax;

public class EmployeeTaxUsingSwitchCase {

    public static void calculateIncomeTax(double salary) {

        double taxableAmount = 0;
        int taxSlab;
        double taxFor10Percent = 0, taxFor15Percent = 0, taxFor20Percent = 0, taxFor30Percent = 0;

        taxSlab = (salary > 700000 && salary <= 1000000) ? 2 : (salary > 1000000 && salary <= 1500000) ? 3 : (salary > 1500000) ? 4 : 1;
        System.out.println("taxSlab: " + taxSlab);

        taxableAmount = salary - 500000;
        System.out.println("Total Taxable Amount:" + taxableAmount);


        switch (taxSlab) {

            case 1: {
                System.out.println("Tax Free");
                break;
            }
            case 2: {
                taxFor10Percent = 0.1 * 200000;
                taxFor15Percent = (0.15 * (taxableAmount - 200000));
                System.out.println("taxFor10Percent: " + taxFor10Percent);
                System.out.println("taxFor15Percent: " + taxFor15Percent);
                break;
            }
            case 3: {
                taxFor10Percent = 0.1 * 200000;
                taxFor15Percent = 0.15 * 300000;
                taxFor20Percent = (0.20 * (taxableAmount - 300000 - 200000));
                System.out.println("taxFor10Percent: " + taxFor10Percent);
                System.out.println("taxFor15Percent: " + taxFor15Percent);
                System.out.println("taxFor20Percent: " + taxFor20Percent);
                break;
            }
            case 4: {
                taxFor10Percent = 0.1 * 200000;
                taxFor15Percent = 0.15 * 300000;
                taxFor20Percent = 0.20 * 500000;
                taxFor30Percent = (0.30 * (taxableAmount - 300000 - 200000 - 500000));
                System.out.println("taxFor10Percent: " + taxFor10Percent);
                System.out.println("taxFor15Percent: " + taxFor15Percent);
                System.out.println("taxFor20Percent: " + taxFor20Percent);
                System.out.println("taxFor30Percent: " + taxFor30Percent);
                break;
            }
            default: {
                System.out.println("taxSlab :" + taxSlab);
                break;
            }
        }
        taxableAmount = taxFor10Percent + taxFor15Percent + taxFor20Percent + taxFor30Percent;
        System.out.println("Total IncomeTax is: " + taxableAmount);
    }

    public static void main(String[] args) {
        calculateIncomeTax(1200000);
    }
}