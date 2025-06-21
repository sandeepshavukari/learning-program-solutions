package FinantialForecasting;

public class SIPWealthForecaster {

    public double calculateFutureValue(double mInv, double anRat, int tenuYrs) {
        double mR = anRat / 12 / 100;
        int totMon = tenuYrs * 12;

        return mInv * (Math.pow(1 + mR, totMon) - 1) * (1 + mR) / mR;
    }

    public double calculateTotalInvested(double mInv, int tenuYrs) {
        return mInv * tenuYrs * 12;
    }

    public double calculateWealthGained(double futVal, double ttlVal) {
        return futVal - ttlVal;
    }
}
