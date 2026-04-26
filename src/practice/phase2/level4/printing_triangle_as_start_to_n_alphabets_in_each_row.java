package practice.phase2.level4;
import java.util.Scanner;

public class printing_triangle_as_start_to_n_alphabets_in_each_row {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("printing triangles as Alphabest in each row reset");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char c = 'A';

        for(int rows = 1; rows<=n; rows++){
            for(int columns = 1; columns<= rows; columns++){
                System.out.printf("%c ", c);
                c++;
            }
            c='A';
            System.out.println();
        }

        sc.close();

    }
}
