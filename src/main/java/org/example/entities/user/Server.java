package org.example.entities.user;

public class Server extends User {
    private String section;

    public Server(String email, String firstName, String lastName, String password, String address, String phone, String confirmationCode, String section,String type) {
        super(email, firstName, lastName, password, address, phone, confirmationCode,type);
        this.section = section;
    }

    @Override
    public String getAccess() {
        return "Server: Access to serving tables.";
    }

    public String serveTable(int tableNumber) {
        return "Serving table " + tableNumber + " in section " + this.section;
    }
}
