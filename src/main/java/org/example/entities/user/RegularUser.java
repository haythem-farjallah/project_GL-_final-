package org.example.entities.user;

public class RegularUser extends User {

    public RegularUser(String email, String firstName, String lastName, String password, String address, String phone, String confirmationCode) {
        super(email, firstName, lastName, password, address, phone, confirmationCode, "regular");
    }

    @Override
    public String getAccess() {
        return "Regular User: Basic access";
    }
}