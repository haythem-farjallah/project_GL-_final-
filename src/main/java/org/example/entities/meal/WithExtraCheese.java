package org.example.entities.meal;

import java.util.List;

public class WithExtraCheese extends MealDecorator {
    private Ingredient cheese;

    public WithExtraCheese(MealComponent decoratedMeal, Ingredient cheese) {
        super(decoratedMeal);
        this.cheese = cheese;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + cheese.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with extra " + cheese.getName();
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = super.getIngredients();
        ingredients.add(cheese);
        return ingredients;
    }
}
