import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int employeeCount = 10;
        double[] salaries = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonuses = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salary and years of service
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            salaries[i] = input.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            yearsOfService[i] = input.nextDouble();
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < employeeCount; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
