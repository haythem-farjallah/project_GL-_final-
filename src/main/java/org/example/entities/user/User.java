package org.example.entities.user;

import org.example.entities.user.Loyalty;

import java.util.Optional;

public abstract class User {
    protected String email;
    protected String firstName;
    protected String lastName;
    protected String password;
    protected String address;
    protected String phone;
    protected boolean isActive;
    protected String confirmationCode;
    protected String type;
    protected Optional<Loyalty> loyalty = Optional.empty();

    public User(String email, String firstName, String lastName, String password, String address, String phone, String confirmationCode, String type) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.isActive = true;
        this.confirmationCode = confirmationCode;
        this.type = type;
    }

    public boolean authenticate(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void updateProfile(String firstName, String lastName, String address, String phone) {
        this.firstName = firstName != null ? firstName : this.firstName;
        this.lastName = lastName != null ? lastName : this.lastName;
        this.address = address != null ? address : this.address;
        this.phone = phone != null ? phone : this.phone;
    }

    public void setLoyalty(Loyalty loyalty) {
        if (this.type.equals("regular")) {
            this.loyalty = Optional.of(loyalty);
        } else {
            throw new IllegalArgumentException("Loyalty can only be assigned to regular users.");
        }
    }

    public Optional<Loyalty> getLoyalty() {
        return this.loyalty;
    }

    public abstract String getAccess();
}
