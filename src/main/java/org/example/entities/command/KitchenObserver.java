package org.example.entities.command;

public class KitchenObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.println("Kitchen received update: Command is now " + state);
        // Perform specific actions based on the state
        if ("Preparing".equals(state)) {
            System.out.println("Kitchen: Start preparing the meal.");
        } else if ("Ready".equals(state)) {
            System.out.println("Kitchen: Meal is ready for delivery.");
        }
    }
}