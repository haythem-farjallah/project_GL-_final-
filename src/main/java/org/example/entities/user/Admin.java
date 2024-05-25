package org.example.entities.user;

public class Admin extends User {

    public Admin(String email, String firstName, String lastName, String password, String address, String phone, String confirmationCode,String type) {
        super(email, firstName, lastName, password, address, phone, confirmationCode,type);
    }

    @Override
    public String getAccess() {
        return "Admin: Access to system administration.";
    }

    public String manageSystem() {
        return "Performing system maintenance and updates.";
    }
}