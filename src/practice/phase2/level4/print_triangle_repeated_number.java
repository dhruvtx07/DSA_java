package practice.phase2.level4;
import java.util.Scanner;

public class print_triangle_repeated_number {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Print triangle as repeated numbers");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row = 1; row <=n; row++){
            for(int column = 1; column <=row; column++){
                System.out.printf("%d ", row);
            }
            System.out.println();
        }

        sc.close();
    }
}
