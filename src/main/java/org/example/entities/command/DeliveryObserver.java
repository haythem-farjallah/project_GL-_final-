package org.example.entities.command;

public class DeliveryObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.println("Delivery received update: Command is now " + state);
        // Perform specific actions based on the state
        if ("Ready".equals(state)) {
            System.out.println("Delivery: Pick up the meal for delivery.");
        } else if ("Completed".equals(state)) {
            System.out.println("Delivery: Order delivered successfully.");
        }
    }
}