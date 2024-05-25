package org.example.entities.user;

public class Cook extends User {
    private String specialty;

    public Cook(String email, String firstName, String lastName, String password, String address, String phone, String confirmationCode, String specialty,String type) {
        super(email, firstName, lastName, password, address, phone, confirmationCode,type);
        this.specialty = specialty;
    }

    @Override
    public String getAccess() {
        return "Cook: Access to kitchen and inventory.";
    }

    public String prepareDish(String dish) {
        return "Preparing " + dish + ", specialty: " + this.specialty;
    }
}