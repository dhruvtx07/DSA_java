package practice.phase2.level4;
import java.util.Scanner;

public class print_triangle_as_counting_numbers_characters {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("print triangle characters as counting numbers");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int num =1;

        for(int row=1; row<=n; row++){
            for(int column=1; column<=row; column++){
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}
