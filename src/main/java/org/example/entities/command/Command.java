package org.example.entities.command;

import org.example.entities.restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Command implements Subject {
    private double price;
    private int duration;
    private String type;
    private double discountPoints;
    private double totalPrice;
    private boolean status;
    private boolean archived;
    private List<Observer> observers;
    private String state;
    private Restaurant restaurant;
    private List<Item> items;

    public Command(double price, int duration, String type, Restaurant restaurant, List<Item> items) {
        this.price = price;
        this.duration = duration;
        this.type = type;
        this.discountPoints = 0.0;
        this.totalPrice = price;
        this.status = false;
        this.archived = false;
        this.observers = new ArrayList<>();
        this.state = "Created"; // Initial state
        this.restaurant = restaurant;
        this.items = items;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.state);
        }
    }

    @Override
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public String getState() {
        return this.state;
    }

    // Business methods
    public void processOrder() {
        setState("Processing");
        // Simulate processing
        setState("Preparing");
        // Simulate preparation
        setState("Ready");
        // Simulate order ready
        setState("Completed");
    }
    private void recalculateTotalPrice() {
        totalPrice = items.stream().mapToDouble(Item::getPrice).sum();
    }

    private void validateConstraints() {
        if (items.isEmpty()) {
            throw new IllegalStateException("The meal list must not be empty.");
        }
        double calculatedTotalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        if (Double.compare(totalPrice, calculatedTotalPrice) != 0) {
            throw new IllegalStateException("The totalPrice must equal the sum of all meal prices.");
        }
    }
    // Getters and setters for other fields
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiscountPoints() {
        return discountPoints;
    }

    public void setDiscountPoints(double discountPoints) {
        this.discountPoints = discountPoints;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
