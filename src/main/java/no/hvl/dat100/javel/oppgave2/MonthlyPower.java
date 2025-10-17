package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {
            DailyPower.printPowerUsage(usage[i]);
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (int i = 0; i < prices.length; i++) {
            DailyPower.printPowerPrices(prices[i]);
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {
        double sum = 0;
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[0].length; j++) {
                sum += usage[i][j];
            }
        }
        sum = (double) Math.round(sum * 100) / 100;
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        while (!exceeded) {

        }
        for (int i = 0; i < powerusage.length; i++) {
            for (int j = 0; j < powerusage.length; j++) {
                usage += powerusage[i][j];
            }
        }
        if (usage > threshold) {
            exceeded = true;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        for (int i = 0; i < usage.length; i ++) {
            price += DailyPower.computeSpotPrice(usage[i], prices[i]);
        }

        price = (double) Math.round(price * 100) / 100;
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i ++){
            support += DailyPower.computePowerSupport(usage[i], prices[i]);
        }
        support = (double) Math.round(support * 100) / 100;
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double NorgesPrisKWH = 0.5;
        double price = 0;

        for(int i = 0; i < usage.length; i++) {
            price += (DailyPower.computePowerUsage(usage[i]) * NorgesPrisKWH);
        }
        price = (double) Math.round(price * 100) / 100;
        return price;
    }
}
