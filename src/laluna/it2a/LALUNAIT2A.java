
package laluna.it2a;

import java.util.Scanner;

public class LALUNAIT2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of applications: ");
        int numApplications = scanner.nextInt();

        for (int i = 0; i < numApplications; i++) {
            System.out.println("Enter details of application " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Monthly Income: ");
            double monthlyIncome = scanner.nextDouble();
            System.out.print("Credit Score: ");
            int creditScore = scanner.nextInt();
            System.out.print("Existing Loans: ");
            double existingLoans = scanner.nextDouble();

            boolean isEligible = monthlyIncome >= 30000 && creditScore >= 650 && existingLoans <= 500000;

            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.printf("Monthly Income: $%,.2f%n", monthlyIncome);
            System.out.println("Credit Score: " + creditScore);
            System.out.printf("Existing Loans: $%,.2f%n", existingLoans);
            System.out.println("Loan Status: " + (isEligible ? "Approved" : "Denied"));
            System.out.println();
        }
    }
}