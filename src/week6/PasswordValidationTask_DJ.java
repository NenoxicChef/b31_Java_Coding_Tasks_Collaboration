package week6;

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

public class PasswordValidationTask_DJ {


        public static void main(String[] args) {
            String password = "Sample@123";
            boolean isValid = validatePassword(password);

            if (isValid) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is not valid.");
            }
        }

        public static boolean validatePassword(String password) {
            // Check for length and space
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            // Check for at least one uppercase letter
            if (!containsUppercase(password)) {
                return false;
            }

            // Check for at least one lowercase letter
            if (!containsLowercase(password)) {
                return false;
            }

            // Check for at least one special character
            if (!containsSpecialCharacter(password)) {
                return false;
            }

            // Check for at least one digit
            if (!containsDigit(password)) {
                return false;
            }

            // All requirements met
            return true;
        }

        //This method checks if the password contains at least one uppercase letter. It iterates through each character
        //and if it finds an uppercase letter it returns true, otherwise it returns false
        private static boolean containsUppercase(String password) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    return true;
                }
            }
            return false;
        }

        //This method checks if the password contains at least one lowercase letter. It iterates through each character
        //and if it finds a lowercase letter it returns true, otherwise it returns false
        private static boolean containsLowercase(String password) {
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    return true;
                }
            }
            return false;
        }

    //This method checks if the password contains at least one special character. It iterates through each character
    //and if it finds a special character it returns true, otherwise it returns false
        private static boolean containsSpecialCharacter(String password) {
            String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";
            for (char c : password.toCharArray()) {
                if (specialCharacters.contains(String.valueOf(c))) {
                    return true;
                }
            }
            return false;
        }

    //This method checks if the password contains at least one digit. It iterates through each character
    //and if it finds a digit it returns true, otherwise it returns false
        private static boolean containsDigit(String password) {
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
            return false;
        }
    }





