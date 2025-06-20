package financialForecasting;

public class SIPWealthForecaster {

    public double calculateFutureValue(double monthlyInvestment, double annualRate, int tenureYears) {
        double monthlyRate = annualRate / 12 / 100;
        int totalMonths = tenureYears * 12;

        return monthlyInvestment * (Math.pow(1 + monthlyRate, totalMonths) - 1) * (1 + monthlyRate) / monthlyRate;
    }

    public double calculateTotalInvested(double monthlyInvestment, int tenureYears) {
        return monthlyInvestment * tenureYears * 12;
    }

    public double calculateWealthGained(double futureValue, double totalInvested) {
        return futureValue - totalInvested;
    }
}
