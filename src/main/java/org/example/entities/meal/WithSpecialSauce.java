package org.example.entities.meal;

import java.util.List;

public class WithSpecialSauce extends MealDecorator {
    private Ingredient sauce;

    public WithSpecialSauce(MealComponent decoratedMeal, Ingredient sauce) {
        super(decoratedMeal);
        this.sauce = sauce;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + sauce.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with special " + sauce.getName();
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = super.getIngredients();
        ingredients.add(sauce);
        return ingredients;
    }
}
