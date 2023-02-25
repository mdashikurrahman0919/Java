import java.util.Scanner;

public class PhoneKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("AAA")) {
            System.out.println("Enter a letter :");
            input = scanner.next();

            if (input.length() == 1) {
                char c = input.charAt(0);
                int number = getNumber(c);
                if (number != -1) {
                    System.out.println("The corresponding number is: " + number);
                } else {
                    System.out.println("Invalid input. Please enter a letter from A to Z or 'AAA' to exit.");
                }
            } else {
                System.out.println("Invalid input. Please enter a single letter or 'AAA' to exit.");
            }
        }
    }

    public static int getNumber(char c) {
        c = Character.toUpperCase(c);
        if (c >= 'A' && c <= 'Z') {
            // The letters A, B, and C map to the number 2
            if (c >= 'A' && c <= 'C') {
                return 2;
            }
            // The letters D, E, and F map to the number 3
            else if (c >= 'D' && c <= 'F') {
                return 3;
            }
            // The letters G, H, and I map to the number 4
            else if (c >= 'G' && c <= 'I') {
                return 4;
            }
            // The letters J, K, and L map to the number 5
            else if (c >= 'J' && c <= 'L') {
                return 5;
            }
            // The letters M, N, and O map to the number 6
            else if (c >= 'M' && c <= 'O') {
                return 6;
            }
            // The letters P, Q, R, and S map to the number 7
            else if (c >= 'P' && c <= 'S') {
                return 7;
            }
            // The letters T, U, and V map to the number 8
            else if (c >= 'T' && c <= 'V') {
                return 8;
            }
            // The letters W, X, Y, and Z map to the number 9
            else {
                return 9;
            }
        }
        // If the input is not a letter, return -1
        return -1;
    }
}