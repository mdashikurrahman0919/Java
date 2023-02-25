import java.util.Scanner;

public class CheckPasswordAnotherway{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("***")) {
            System.out.println("Please Enter at least eight letters and digits: ");
            password = scanner.nextLine();

            if (!password.equals("***")) {
                if (isValidPassword(password)) {
                    System.out.println("Valid Password");
                } else {
                    System.out.println("Invalid Password");
                }
            }
        }
    }

    public static boolean isValidPassword(String password) {
        // Check that the password has at least eight characters
        if (password.length() < 8) {
            return false;
        }

        // Check that the password consists of only letters and digits
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Check that the password contains at least two digits
        int numDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                numDigits++;
            }
        }
        if (numDigits < 2) {
            return false;
        }

        return true;
    }
}