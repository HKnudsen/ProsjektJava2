package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customerId;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customerId = customer_id;
        this.agreement = agreement;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getCustomerId() {
        return this.customerId;
    }
    public PowerAgreementType getAgreement(){
        return this.agreement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }

    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }

    @Override
    public String toString() {
        return "Customer number " + this.customerId + "\n" +
                "Name " + this.name + "\n" +
                "Email " + this.email + "\n" +
                "Agreement " + this.agreement;
    }


    // TODO - toString method

}
