package org.example.entities.restaurant;

import org.example.entities.meal.Menu;
import org.example.entities.user.Loyalty;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String email;
    private String name;
    private String localisation;
    private String phone;
    private boolean isVerified;
    private boolean isActive;
    private String speciality;
    private boolean hasLoyaltyProgram;
    private String loyaltyProgramDetails;
    private List<Menu> menus;
    private Loyalty loyalty;
    private ClientSatisfaction clientSatisfaction;

    // Private constructor to enforce the use of the builder
    private Restaurant() {}

    // Getters for the Restaurant properties
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLocalisation() {
        return localisation;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean hasLoyaltyProgram() {
        return hasLoyaltyProgram;
    }

    public String getLoyaltyProgramDetails() {
        return loyaltyProgramDetails;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public Loyalty getLoyalty() {
        return loyalty;
    }

    public ClientSatisfaction getClientSatisfaction() {
        return clientSatisfaction;
    }

    // Setters and methods to enforce the invariant
    public void setActive(boolean isActive) {
        this.isActive = isActive;
        validateConstraints();
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
        validateConstraints();
    }

    public void addMenu(Menu menu) {
        this.menus.add(menu);
        validateConstraints();
    }

    private void validateConstraints() {
        if (isActive && (menus == null || menus.isEmpty())) {
            throw new IllegalStateException("Active restaurant must have at least one menu.");
        }
    }

    // Static nested Builder class
    public static class RestaurantBuilder implements Builder {
        private String email;
        private String name;
        private String localisation;
        private String phone;
        private boolean isVerified;
        private boolean isActive;
        private String speciality;
        private boolean hasLoyaltyProgram;
        private String loyaltyProgramDetails;
        private List<Menu> menus = new ArrayList<>();
        private Loyalty loyalty;
        private ClientSatisfaction clientSatisfaction;

        // Setters for Restaurant properties
        public RestaurantBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public RestaurantBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RestaurantBuilder setLocalisation(String localisation) {
            this.localisation = localisation;
            return this;
        }

        public RestaurantBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public RestaurantBuilder setVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public RestaurantBuilder setActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public RestaurantBuilder setSpeciality(String speciality) {
            this.speciality = speciality;
            return this;
        }

        public RestaurantBuilder setMenus(List<Menu> menus) {
            this.menus = menus;
            return this;
        }

        public RestaurantBuilder setLoyalty(Loyalty loyalty) {
            this.loyalty = loyalty;
            return this;
        }

        public RestaurantBuilder setClientSatisfaction(ClientSatisfaction clientSatisfaction) {
            this.clientSatisfaction = clientSatisfaction;
            return this;
        }

        @Override
        public RestaurantBuilder setHasLoyaltyProgram(boolean hasLoyaltyProgram) {
            this.hasLoyaltyProgram = hasLoyaltyProgram;
            return this;
        }

        @Override
        public RestaurantBuilder setLoyaltyProgramDetails(String details) {
            this.loyaltyProgramDetails = details;
            return this;
        }

        // Method to build and return a Restaurant object
        public Restaurant build() {
            Restaurant restaurant = new Restaurant();
            restaurant.email = this.email;
            restaurant.name = this.name;
            restaurant.localisation = this.localisation;
            restaurant.phone = this.phone;
            restaurant.isVerified = this.isVerified;
            restaurant.isActive = this.isActive;
            restaurant.speciality = this.speciality;
            restaurant.hasLoyaltyProgram = this.hasLoyaltyProgram;
            restaurant.loyaltyProgramDetails = this.loyaltyProgramDetails;
            restaurant.menus = this.menus;
            restaurant.loyalty = this.loyalty;
            restaurant.clientSatisfaction = this.clientSatisfaction;
            restaurant.validateConstraints(); // Validate constraints upon creation
            return restaurant;
        }
    }
}
