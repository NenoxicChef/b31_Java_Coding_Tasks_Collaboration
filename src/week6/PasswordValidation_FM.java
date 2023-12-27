package week6;

public class PasswordValidation_FM {

    public static void main(String[] args) {
        String password = "Password@123"; // Replace with the password you want to test
        boolean isValid = isPasswordValid(password);
        System.out.println("Password is valid: " + isValid);
    }



    public static boolean isPasswordValid(String password) {
        // Requirement 1: Password must be at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: Password should contain at least one upper case letter
        boolean hasUpperCase = false;
        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        // Requirement 3: Password should contain at least one lower case letter
        boolean hasLowerCase = false;
        for (char each : password.toCharArray()) {
            if (Character.isLowerCase(each)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            return false;
        }

        // Requirement 4: Password should contain at least one special character
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
        boolean hasSpecialChar = false;
        for (char each : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(each))) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Requirement 5: Password should contain at least one digit
        boolean hasDigit = false;
        for (char each : password.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
    }

}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */

