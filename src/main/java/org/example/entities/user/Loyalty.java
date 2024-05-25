package org.example.entities.user;

public class Loyalty {
    private int points;
    private int thresholdTracker;

    public Loyalty(int points, int thresholdTracker) {
        this.points = points;
        this.thresholdTracker = thresholdTracker;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getThresholdTracker() {
        return thresholdTracker;
    }

    public void setThresholdTracker(int thresholdTracker) {
        this.thresholdTracker = thresholdTracker;
    }
}