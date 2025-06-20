package financialForecasting;

import java.util.Scanner;

public class SIPDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SIPWealthForecaster forecaster = new SIPWealthForecaster();

        System.out.println("=== SIP Wealth Growth Forecaster ===");

        System.out.print("Enter Monthly Investment Amount (₹): ");
        double monthlyInvestment = scanner.nextDouble();

        System.out.print("Enter Expected Annual Return Rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter Investment Tenure (in years): ");
        int tenureYears = scanner.nextInt();

        double futureValue = forecaster.calculateFutureValue(monthlyInvestment, annualRate, tenureYears);
        double totalInvested = forecaster.calculateTotalInvested(monthlyInvestment, tenureYears);
        double wealthGained = forecaster.calculateWealthGained(futureValue, totalInvested);

        System.out.printf("\nFuture Value of Investment: ₹%.2f", futureValue);
        System.out.printf("\nTotal Invested Amount: ₹%.2f", totalInvested);
        System.out.printf("\nWealth Gained (Profit): ₹%.2f\n", wealthGained);

        scanner.close();
    }
}
