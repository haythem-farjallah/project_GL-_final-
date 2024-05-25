package org.example.entities.meal;

import java.util.List;

public interface MealComponent {
    double getPrice();
    String getDescription();
    List<Ingredient> getIngredients();
}
