package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer henrik = new Customer("Henrik","henrik@",1,PowerAgreementType.SPOTPRICE);
        Invoice invoice = new Invoice(henrik,"January", MonthPowerData.powerusage_month,MonthPowerData.powerprices_month);
        Invoice invoice1 = new Invoice(henrik,"February", MonthPowerData.powerusage_month,MonthPowerData.powerprices_month);
        invoice.computeAmount();
        invoice.printInvoice();
        Invoice[] invoicer = {invoice, invoice1};

        Invoices.processInvoices(invoicer);



        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
