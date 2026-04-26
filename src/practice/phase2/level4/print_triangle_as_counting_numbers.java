package practice.phase2.level4;
import java.util.Scanner;

public class print_triangle_as_counting_numbers {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("triangle as counting numbers characters reset on 10");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int counting = 1;

        for(int rows = 1; rows<=n; rows++){
            for(int columns = 1; columns<=rows; columns++){
                System.out.printf("%d ", counting%10);
                counting++;
            }
            System.out.println();
        }

        sc.close();

    }
}
