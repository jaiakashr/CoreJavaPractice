
//Encapsulation = Control + Protection
//Getters/Setters don’t just expose variables → they let you add rules, validation, and security.
//If rules change in future, you update only methods (not everywhere in code).



package OOPS;

class User {
    private String password; // hidden

    // setter with rules
    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
            System.out.println("Password set successfully ✅");
        } else {
            System.out.println("❌ Password too short (must be at least 6 characters)");
        }
    }

    // getter (⚠️ optional - usually you don’t return password directly!)
    public String getPassword() {
        return "*****"; // just return masked version
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        User user = new User();

        user.setPassword("123");      // ❌ too short
        user.setPassword("abc123");   // ✅ valid

        System.out.println("Password: " + user.getPassword()); 
        // Output: *****
    }
}
