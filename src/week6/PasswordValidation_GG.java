package week6;

public class PasswordValidation_GG {

        //Main method.
        //It sets a sample password ("YourPassword123#") for testing purposes.
        //Calls the validatePassword method to check if the password is valid.
        //Prints the result indicating whether the password is valid or not.
        public static void main(String[] args) {
            String password = "YourPassword123#"; // Replace with the password you want to validate
            boolean isValid = validatePassword(password); //
            System.out.println("Is the password valid? = " + isValid);
        }

        public static boolean validatePassword(String password) {
            return isLengthValid(password) &&
                    containsUpperCase(password) &&
                    containsLowerCase(password) &&
                    containsSpecialCharacter(password) &&
                    containsDigit(password);
        }
        //I combine all the requirements in this method.
        //The validatePassword method calls several helper methods to check different criteria for password validation.
        //Returns true only if all the criteria are met; otherwise, returns false.

        private static boolean isLengthValid(String password) {
            return password.length() >= 6 && !password.contains(" ");
        }
        //Checks if the password length is at least 6 characters and does not contain a space.

        private static boolean containsUpperCase(String password) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    return true;
                }
            }
            return false;
        }
        //Iterates through each character in the password to check if there is at least one uppercase letter.

        private static boolean containsLowerCase(String password) {
            for (char ch : password.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    return true;
                }
            }
            return false;
        }
        //Iterates through each character in the password to check if there is at least one lowercase letter.

        private static boolean containsSpecialCharacter(String password) {
            String specialCharacters = "!@#$%^&*()-_=+[]{}|;:',.<>/?"; // contains special chars
            for (char ch : password.toCharArray()) {
                if (specialCharacters.indexOf(ch) != -1) {
                    return true;
                }
            }
            return false;
        }
        //Defines a string (specialCharacters) containing a set of allowed special characters.
        //Iterates through each character in the password to check if it matches any special character.

        private static boolean containsDigit(String password) {
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    return true;
                }
            }
            return false;
        }
        //Iterates through each character in the password to check if there is at least one digit.
    }
