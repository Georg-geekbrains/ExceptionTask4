package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            if (userInput.isEmpty()) {
                throw new EmptyStringException("Пустая строка не допустима.");
            } else {
                System.out.println("Ваша строка: " + userInput);
            }
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
