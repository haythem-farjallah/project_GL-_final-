package org.example;

import org.example.entities.command.*;
import org.example.entities.meal.*;
import org.example.entities.restaurant.Restaurant;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Restaurant restaurant = new Restaurant.RestaurantBuilder()
                .setEmail("contact@restaurant.com")
                .setName("The Great Restaurant")
                .setLocalisation("123 Main St")
                .setPhone("555-1234")
                .setVerified(true)
                .setActive(true)
                .setSpeciality("Italian")
                .setHasLoyaltyProgram(true)
                .setLoyaltyProgramDetails("Earn points with every purchase")
                .build();
        Ingredient cheese = new Ingredient("Cheese", 1.5, true, "cheese.jpg");
        Ingredient sauce = new Ingredient("Special Sauce", 2.0, true, "sauce.jpg");

        MealComponent basicMeal = new BasicMeal("Pasta", 8.0, true, "Delicious pasta");
        MealComponent mealWithCheese = new WithExtraCheese(basicMeal, cheese);
        MealComponent mealWithCheeseAndSauce = new WithSpecialSauce(mealWithCheese, sauce);
        // Create items
        Item item1 = new Item("Pasta", 8.0, true);
        Item item2 = new Item("Salad", 5.0, true);

        // Create command with related restaurant and items
        Command command = new Command(15.0, 30, "Food Order", restaurant, Arrays.asList(item1, item2));

        // Create observers
        Observer kitchenObserver = new KitchenObserver();
        Observer deliveryObserver = new DeliveryObserver();

        // Attach observers to the command
        command.addObserver(kitchenObserver);
        command.addObserver(deliveryObserver);

        // Process the order
        command.processOrder();
    }
}