package practice.phase2.level4;
import java.util.Scanner;

public class print_centered_pyramid_as_alphabets {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("printing pyramid as alphabets");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char c = 'A';

        for(int rows = 1; rows <= n; rows++){
            for(int gap = 1; gap <= n - rows; gap++){
                System.out.printf(" ");
            }
            for(int column = 1; column<=2*rows-1; column++){
                System.out.printf("%c ", c);
                c++;
            }
            System.out.println();
        }


        sc.close();

    }
}
