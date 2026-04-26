package practice.phase2.level4;
import java.util.Scanner;

public class print_centre_aligned_triangle {
    public static void main(String[] args){
        System.out.println("---------------------");
        System.out.println("Print center aligned triangle");
        System.out.println("---------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++){
            for(int gap = 1; gap <= n-row; gap++){
                System.out.printf(" ");
            }
            for(int column = 1; column <= (row * 2 - 1); column++){
                System.out.printf("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
