package org.example.entities.meal;

import java.util.List;

public class Category {
    private String name;
    private List<BasicMeal> meals;

    public Category(String name, List<BasicMeal> meals) {
        this.name = name;
        this.meals = meals;
    }
}
