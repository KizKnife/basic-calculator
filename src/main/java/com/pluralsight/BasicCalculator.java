package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            System.out.print("Enter the first number: ");
        }
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            System.out.print("Enter the first number: ");
        }
        int num2 = scanner.nextInt();

        System.out.printf("Possible calculations:" +
                "%n     (A)dd" +
                "%n     (S)ubtract" +
                "%n     (M)ultiply" +
                "%n     (D)ivide");

        System.out.printf("%nPlease select an option: ");
        String option = scanner.next().toLowerCase();
        while (!option.equals("a")
                && !option.equals("s")
                && !option.equals("m")
                && !option.equals("d")) {
            System.out.println("Invalid option!");
            System.out.print("Please select an option: ");
            scanner.next();
        }

        if (option.equals("a")) {
            System.out.printf("%d * %d = %d", num1, num2, num1 + num2);
        }
        else if (option.equals("s")) {
            System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        }
        else if (option.equals("m")) {
            System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        }
        else if (option.equals("d")) {
            System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
        }
    }
}
