package org.example.entities.meal;

import java.util.ArrayList;
import java.util.List;

public class BasicMeal implements MealComponent {
    private String name;
    private double price;
    private boolean isAvailable;
    private String description;
    private List<Ingredient> ingredients;

    public BasicMeal(String name, double price, boolean isAvailable, String description) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.description = description;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    // Methods to add and remove ingredients
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
