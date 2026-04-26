package practice.phase2.level4;
import java.util.Scanner;

public class print_triangle_as_repeating_alphabets {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("Printing triangle as repeating alphabets");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char c ='A';

        for(int rows = 1; rows<= n; rows++){
            for(int column = 1; column<= rows; column++){
                System.out.printf("%c ", c);
            }
            c++;
            System.out.println();
        }

        sc.close();

    }
}
