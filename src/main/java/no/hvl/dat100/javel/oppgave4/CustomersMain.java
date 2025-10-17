package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();


        Customer henrik = new Customer("Henrik Knudsen", "henrik@",1,PowerAgreementType.SPOTPRICE);
        Customer malin = new Customer("Malin Pehrson", "malin@", 2, PowerAgreementType.POWERSUPPORT);
        Customer viktor = new Customer("Viktor K", "viktor@", 3, PowerAgreementType.POWERSUPPORT);
        Customer test = new Customer("Test", "Testt@", 4, PowerAgreementType.POWERSUPPORT);

        Customers customers = new Customers(5);
        customers.addCustomer(henrik);
        customers.addCustomer(malin);
        customers.addCustomer(viktor);
        customers.addCustomer(test);


        customers.removeCustomer(1);
        Customer[] list = customers.getCustomers();
        for (Customer c : list) {
            System.out.println(c);
        }


        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
