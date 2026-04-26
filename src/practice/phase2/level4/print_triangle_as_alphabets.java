package practice.phase2.level4;
import java.util.Scanner;

public class print_triangle_as_alphabets {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Printing triangle as alphabets");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char c ='A';

        for(int rows =1; rows<=n; rows++){
            for(int columns = 1; columns<= rows; columns++){
                System.out.printf("%c", c);
                c++;
            }
            System.out.println();
        }

        sc.close();
    }
}
