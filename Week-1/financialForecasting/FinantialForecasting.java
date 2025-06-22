package FinantialForecasting;

import java.util.Scanner;

public class FinantialForecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SIPWealthForecaster frcst = new SIPWealthForecaster();

        System.out.println("=== SIP Wealth Growth Forecaster (Recursive) ===");

        System.out.print("Enter Monthly Investment Amount (₹): ");
        double mInv = sc.nextDouble();

        System.out.print("Enter Expected Annual Return Rate (%): ");
        double anRat = sc.nextDouble();

        System.out.print("Enter Investment Tenure (in years): ");
        int tenuYrs = sc.nextInt();

        double futval = frcst.calculateFutureValue(mInv, anRat, tenuYrs);
        double ttlInv = frcst.calculateTotalInvested(mInv, tenuYrs);
        double wltGain = frcst.calculateWealthGained(futval, ttlInv);

        System.out.printf("\nFuture Value of Investment: ₹%.2f", futval);
        System.out.printf("\nTotal Invested Amount: ₹%.2f", ttlInv);
        System.out.printf("\nWealth Gained (Profit): ₹%.2f\n", wltGain);
    }
}
