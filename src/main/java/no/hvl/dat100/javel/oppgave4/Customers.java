package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;
        for (Customer c : this.customers) {
            System.out.println(c);
            if (c != null) {
                count++;
            }
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;
        boolean funnet = false;
        for (int i = 0; i <this.customers.length; i++) {
            if (this.customers[i].getCustomerId() == customer_id) {
                c = customers[i];
                funnet = true;
                return c;
            }
        }
        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {
        boolean inserted = false;
        for(int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] == null) {
                this.customers[i] = c;
                inserted = true;
                break;
            }
        }
        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {
        boolean deleted = false;
        Customer c = null;
        for (int i = 0; i < this.customers.length; i++) {
            try {
                if (this.customers[i].getCustomerId() == customer_id) {
                    c = this.customers[i];
                    this.customers[i] = null;
                    deleted = true;
                    return c;
                }
            } catch (Exception _) {

            }
        }
        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;
        int count = 0;

        for (Customer c : this.customers) {
            if (c != null) {
                count++;
            }
        }

        customers = new Customer[count];
        int addedCount = 0;

        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] != null) {
                customers[addedCount] = this.customers[i];
                addedCount++;
            }
        }
        return customers;
    }
}