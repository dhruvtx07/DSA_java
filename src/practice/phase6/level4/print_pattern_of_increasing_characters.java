package practice.phase6.level4;
import java.util.Scanner;

public class print_pattern_of_increasing_characters {
    public static void main(String[] args){
        System.out.println("print pattern of increasing characters");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of rows: ");
        int n = sc.nextInt();

        for(int rows = 1; rows<=n; rows++){
            char c = 'A';
            for(int columns = 1; columns<=rows; columns++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

        sc.close();
    }
}
