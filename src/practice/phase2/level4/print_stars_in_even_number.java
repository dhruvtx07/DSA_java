package practice.phase2.level4;
import java.util.Scanner;

public class print_stars_in_even_number {
    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("printing stars in even number");
        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int row= 1; row<=n ; row++){
            for(int column = 1; column <= 2*row; column++){
                System.out.printf("* ");
            }
            System.out.println();
        }

        sc.close();
    }

}
