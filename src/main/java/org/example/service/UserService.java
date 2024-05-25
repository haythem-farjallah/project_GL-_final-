package org.example.service;

import org.example.entities.user.*;

public class UserService {
    public boolean authenticateUser(User user, String email, String password) {
        return user.authenticate(email, password);
    }

    public void updateUserProfile(User user, String firstName, String lastName, String address, String phone) {
        user.updateProfile(firstName, lastName, address, phone);
    }

    public String getUserAccess(User user) {
        return user.getAccess();
    }
    public String specificUserOperation(User user) {
        if (user instanceof Server) {
            return ((Server) user).serveTable(5);
        } else if (user instanceof Manager) {
            return ((Manager) user).manageStaff();
        } else if (user instanceof Owner) {
            return ((Owner) user).reviewFinancials();
        } else if (user instanceof Admin) {
            return ((Admin) user).manageSystem();
        } else if (user instanceof Cook) {
            return ((Cook) user).prepareDish("Pasta");
        }
        return "No specific operation available for this user type.";
    }
    public void handleUserAccess(User user) {
        System.out.println(getUserAccess(user));
        System.out.println(specificUserOperation(user));
    }
}
