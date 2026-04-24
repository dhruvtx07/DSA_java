package practice.phase2.level1;
import java.util.Scanner;

public class print_in_decreasing_order {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("print in decreasing order");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        for(int i = num; i>=0; i--){
            System.out.printf("%d\n", i);
        }

        sc.close();
    }
}
