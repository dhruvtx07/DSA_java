package practice.phase2.level4;
import java.util.Scanner;

public class print_pyramid_of_stars_with_b {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("print pyramid of stars with character");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++ ){
            for(int gap = 1; gap<= n-row; gap++){
                System.out.printf("b");
            }
            for(int column = 1; column <= row; column++){
                if(column==row){
                    System.out.printf("*");
                }else{
                    System.out.printf("*b");
                }
            }
            System.out.println();
        }




        sc.close();

    }
}
