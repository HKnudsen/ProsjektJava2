package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        MonthlyPower.print_PowerUsage(power_usage_month);
        MonthlyPower.print_PowerPrices((power_prices_month));
        double computePwUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println(computePwUsage);
        System.out.println(MonthlyPower.computePowerUsage(power_usage_month));
        double monthlySpotPrice = MonthlyPower.computeSpotPrice(power_usage_month,power_prices_month);
        System.out.println(monthlySpotPrice);
        double monthlySupport = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.println(monthlySupport);

        double norgesPrisMnd = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println(norgesPrisMnd);



        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}