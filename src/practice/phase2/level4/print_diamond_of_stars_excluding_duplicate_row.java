package practice.phase2.level4;
import java.util.Scanner;

public class print_diamond_of_stars_excluding_duplicate_row {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Printing diamond of stars excluding duplicate row");
        System.out.println("---------------");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int rows = 1; rows <=n; rows++){
            for(int column = 1; column<=rows; column++ ){
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        for(int rows = n-1; rows >=1; rows--){
            for(int column = 1; column<=rows; column++ ){
                System.out.printf("%d ", column);
            }
            System.out.println();
        }

        sc.close();
    }
}
