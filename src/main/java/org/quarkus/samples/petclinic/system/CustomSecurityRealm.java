package org.quarkus.samples.petclinic.system;

import org.jboss.as.security.plugins.SimpleUsernamePasswordLoginModule;

public class CustomSecurityRealm extends SimpleUsernamePasswordLoginModule {
    @Override
    protected String getUsersPassword() {
        // Retrieve the user's password from your database based on the provided username (email).
        String username = getUsername();
        // Perform a database lookup and return the hashed password.
        String hashedPassword = getPasswordFromDatabase(username);
        return hashedPassword;
    }

    // Implement a method to retrieve the user's hashed password from your database.
    private String getPasswordFromDatabase(String username) {
        // Database should be queried here.
        // Returns the hashed password associated with the provided username.
        // Returns null if the user is not found.
        return null;
    }
}
