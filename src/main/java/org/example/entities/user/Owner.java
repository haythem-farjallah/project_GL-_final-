package org.example.entities.user;


public class Owner extends User {

    public Owner(String email, String firstName, String lastName, String password, String address, String phone, String confirmationCode,String type) {
        super(email, firstName, lastName, password, address, phone, confirmationCode,type);
    }

    @Override
    public String getAccess() {
        return "Owner: Full access to the restaurant operations.";
    }

    public String reviewFinancials() {
        return "Reviewing financial statements and operations.";
    }
}