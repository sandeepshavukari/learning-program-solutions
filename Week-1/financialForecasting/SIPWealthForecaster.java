package FinantialForecasting;

public class SIPWealthForecaster {

    public double calculateFutureValue(double mInv, double anRat, int tenuYrs) {
        double mR = anRat / 12 / 100;
        int totMon = tenuYrs * 12;
        return calculateRecursive(mInv, mR, totMon);
    }

    private double calculateRecursive(double mInv, double mR, int months) {
        if (months == 0) {
            return 0;
        }
        return (calculateRecursive(mInv, mR, months - 1) + mInv) * (1 + mR);
    }

    public double calculateTotalInvested(double mInv, int tenuYrs) {
        return mInv * tenuYrs * 12;
    }

    public double calculateWealthGained(double futVal, double ttlVal) {
        return futVal - ttlVal;
    }
}
