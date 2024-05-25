package org.example.entities.command;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setState(String state);
    String getState();
}