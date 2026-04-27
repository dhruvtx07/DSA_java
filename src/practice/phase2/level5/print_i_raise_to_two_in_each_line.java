package practice.phase2.level5;
import java.util.Scanner;

public class print_i_raise_to_two_in_each_line {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Printing i*i in each line");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter last number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i*i; j++){
                System.out.printf("%d * ", j);
            }
            System.out.println();
        }

        sc.close();
    }
}
