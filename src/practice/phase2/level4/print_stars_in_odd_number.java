package practice.phase2.level4;
import java.util.Scanner;

public class print_stars_in_odd_number {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("print stars in odd number");
        System.out.println("----------------");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            for(int column = 1; column<= (2*row-1); column++){
                System.out.printf("* ");
            }
            System.out.println();
        }

        sc.close();

    }
}
