package controlflow;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        System.out.println("\n===== FOR LOOP =====");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n===== WHILE LOOP =====");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\n===== DO-WHILE LOOP =====");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= n);

        System.out.println("\n\n===== BREAK EXAMPLE =====");
        for (int k = 1; k <= n; k++) {
            if (k == 5) break;
            System.out.print(k + " ");
        }

        System.out.println("\n\n===== CONTINUE EXAMPLE =====");
        for (int k = 1; k <= n; k++) {
            if (k == 5) continue;
            System.out.print(k + " ");
        }

        System.out.println("\n\n===== NESTED LOOP (Pattern) =====");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n===== FOR-EACH LOOP =====");
        int[] arr = {10, 20, 30, 40};

        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println("\n\n===== FOR-EACH WITH STRING ARRAY =====");
        String[] names = {"Dhruv", "Aman", "Rahul"};

        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
