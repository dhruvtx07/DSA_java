package practice.phase2.level4;
import java.util.Scanner;

public class print_centered_pyramid_excluding_duplicate_row {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Print centered pyramid excluding duplicate row");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int rows = 1; rows<=n; rows++){
            for(int gap = n-rows; gap>=1; gap--){
                System.out.printf(" ");
            }
            for(int column = 1; column<=rows*2-1; column++){
                System.out.printf("*");
            }
            System.out.println();
        }

        for(int rows = n-1; rows>=1; rows--){
            for(int gap = 1; gap<=(n-rows); gap++){
                System.out.printf(" ");
            }
            for(int column = 1; column<=rows*2-1; column++){
                System.out.printf("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
