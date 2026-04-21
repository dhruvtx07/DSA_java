package controlflow;

import java.util.Scanner;

public class condtionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("\n===== IF STATEMENT =====");
        if (num > 0) {
            System.out.println("Number is positive");
        }

        System.out.println("\n===== IF-ELSE =====");
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        System.out.println("\n===== IF-ELSE-IF LADDER =====");
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        System.out.println("\n===== NESTED IF =====");
        if (num >= 0) {
            if (num == 0) {
                System.out.println("Number is zero");
            } else {
                System.out.println("Number is positive");
            }
        } else {
            System.out.println("Number is negative");
        }

        System.out.println("\n===== SWITCH STATEMENT =====");
        System.out.println("Enter day number (1-7):");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("\n===== TERNARY OPERATOR =====");
        String result = (num >= 0) ? "Non-negative" : "Negative";
        System.out.println("Result: " + result);

        sc.close();
    }
}
