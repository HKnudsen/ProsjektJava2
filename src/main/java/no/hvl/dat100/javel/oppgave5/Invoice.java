package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {
        if (c.getAgreement() == PowerAgreementType.SPOTPRICE) {
            this.amount = MonthlyPower.computeSpotPrice(usage, prices);
            } else if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
            this.amount = MonthlyPower.computeNorgesPrice(usage);
            } else if (c.getAgreement() == PowerAgreementType.POWERSUPPORT) {
            this.amount = MonthlyPower.computeSpotPrice(usage,prices) - MonthlyPower.computePowerSupport(usage, prices);
        }
    }

    public void printInvoice() {
        System.out.println("Customer number " + c.getCustomerId() + "\n" +
                            "Name " + c.getName() + "\n " +
                            "Email " + c.getEmail() + "\n" +
                            "Agreement " + c.getAgreement() + "\n\n" +
                            "Month: " + this.month + "\n" +
                            "Usage:   " + MonthlyPower.computePowerUsage(usage) + " kWh\n" +
                            "Amount:   " + this.amount + " NOK");

    }
}
