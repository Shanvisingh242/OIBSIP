package task1;
import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Login ID: ");
        String loginID = in.nextLine();
        String loginResult = validateLoginID(loginID);
        if (!loginResult.equals("Valid")) {
            System.out.println("Invalid Login ID: " + loginResult);
            in.close();
            return;
        }
        System.out.print("Enter Password: ");
        String password = in.nextLine();
        String passResult = validatePassword(password);
        if (!passResult.equals("Valid")) {
            System.out.println("Invalid Password: " + passResult);
        } else {
            System.out.println("\n Login Successful! Welcome " + loginID);
        }
        in.close();
    }
    public static String validateLoginID(String id) {
        if (id.length() < 5 || id.length() > 12) {
            return "must be 5-12 characters long";
        }
        for (char c : id.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                return "can only contain letters, digits, and underscore (_) (no spaces or special symbols)";
            }
        }
        return "Valid";
    }
    public static String validatePassword(String pass) {
        if (pass.length() < 8 || pass.length() > 15) {
            return "must be 8-15 characters long";
        }
        if (pass.contains(" ")) {
            return "must not contain spaces";
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        String specialChars = "!@#$%^&*()-_+=<>?/{}~";
        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specialChars.indexOf(c) != -1) hasSpecial = true;
        }
        if (!hasUpper) return "must contain at least one uppercase letter";
        if (!hasLower) return "must contain at least one lowercase letter";
        if (!hasDigit) return "must contain at least one digit";
        if (!hasSpecial) return "must contain at least one special character (!@#$%^&* etc.)";
        return "Valid";
    }
}
