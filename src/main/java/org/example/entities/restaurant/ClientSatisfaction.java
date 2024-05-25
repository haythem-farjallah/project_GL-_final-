package org.example.entities.restaurant;

public class ClientSatisfaction {
    private String response;

    public ClientSatisfaction(String response) {
        this.response = response;
    }

    // Getter and setter
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
