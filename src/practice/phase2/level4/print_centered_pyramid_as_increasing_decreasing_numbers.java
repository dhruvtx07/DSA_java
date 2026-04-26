package practice.phase2.level4;
import java.util.Scanner;

public class print_centered_pyramid_as_increasing_decreasing_numbers {
    public static void main(String[] args){
        System.out.println("-------------------");
        System.out.println("printing centered pyramid as increasing and decreasing numbers");
        System.out.println("-------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int rows = 1; rows<=n; rows++){
            for(int gap = 1; gap<=n-rows; gap++){
                System.out.printf(" ");
            }
            for(int columnAsc = 1; columnAsc<=rows; columnAsc++){
                System.out.printf("%d", columnAsc);
            }
            for(int columnDesc = rows-1; columnDesc>=1; columnDesc--){
                System.out.printf("%d", columnDesc);
            }



            System.out.println();
        }

        sc.close();
    }
}
