package practice.phase2.level4;
import java.util.Scanner;

public class right_aligned_triangle {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Right aligned triangle");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++){
            for(int gap = 1; gap <= n - row; gap++){
                System.out.printf(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.printf("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
