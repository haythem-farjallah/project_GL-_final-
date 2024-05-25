package org.example.entities.user;

public class Manager extends  User {
    private String department;

    public Manager(String email, String firstName, String lastName, String password, String address, String phone, String confirmationCode, String department,String type) {
        super(email,firstName,lastName,password,address,phone,confirmationCode,type);
        this.department = department;
    }

    @Override
    public String getAccess() {
        return "Manager: Access to management and operations.";
    }

    public String manageStaff() {
        return "Managing staff in the " + this.department + " department.";
    }
}