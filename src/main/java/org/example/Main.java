package org.example;

import java.util.Scanner;

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            if (userInput.isEmpty()) {
                throw new EmptyStringException("Empty strings should not be entered.");
            } else {
                System.out.println("You entered: " + userInput);
            }
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
