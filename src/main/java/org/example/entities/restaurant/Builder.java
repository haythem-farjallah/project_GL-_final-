package org.example.entities.restaurant;

public interface Builder {

    Restaurant.RestaurantBuilder setHasLoyaltyProgram(boolean hasLoyaltyProgram);
    Restaurant.RestaurantBuilder setLoyaltyProgramDetails(String details);
}
