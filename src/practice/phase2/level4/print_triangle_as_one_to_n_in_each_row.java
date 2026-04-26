package practice.phase2.level4;
import java.util.Scanner;

public class print_triangle_as_one_to_n_in_each_row {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("printing triangle as number 1 to n in each row");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int rows =1; rows<=n; rows++){
            for(int columns= 1; columns<=rows; columns++){
                System.out.printf("%d ", columns);
            }
            System.out.println();
        }

        sc.close();
    }
}
