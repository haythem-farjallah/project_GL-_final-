package org.example.entities.meal;

import java.util.List;

public class Menu {
    private String saison;
    private boolean visibility;
    private List<Category> categories;

    public Menu(String saison, boolean visibility, List<Category> categories) {
        this.saison = saison;
        this.visibility = visibility;
        this.categories = categories;
    }
}
