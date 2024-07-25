package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose operation: 1. Add 2. Subtract 3. Multiply 4. Divide 5. Exit");
            int operation = scanner.nextInt();

            if (operation == 5) {
                break;
            }

            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            
            // Consume the newline character
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    break;
            }
        }
        
        scanner.close();
    }
}
