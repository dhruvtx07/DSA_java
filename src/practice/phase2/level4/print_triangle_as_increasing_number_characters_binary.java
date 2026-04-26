package practice.phase2.level4;
import java.util.Scanner;

public class print_triangle_as_increasing_number_characters_binary {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("Printing triangle as binary characters");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int counter = 1;

        for(int rows = 1; rows <=n; rows++){
            for(int columns = 1; columns<=rows; columns++){
                System.out.printf("%d ", counter%2);
                counter++;
            }
            System.out.println();
        }


        sc.close();
    }
}
