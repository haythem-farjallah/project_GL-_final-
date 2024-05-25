package org.example.entities.meal;

import java.util.List;

public abstract class MealDecorator implements MealComponent {
    protected MealComponent decoratedMeal;

    public MealDecorator(MealComponent decoratedMeal) {
        this.decoratedMeal = decoratedMeal;
    }

    @Override
    public double getPrice() {
        return decoratedMeal.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedMeal.getDescription();
    }

    @Override
    public List<Ingredient> getIngredients() {
        return decoratedMeal.getIngredients();
    }
}
