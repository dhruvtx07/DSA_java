package practice.phase3.level3;
import java.util.Scanner;

public class print_sum_of_series_display_at_each_step {
    public static void fun(int i, int n, int sum){
        if(i>n){
            System.out.println();
            return;
        }
        sum = sum + i;
        System.out.printf("%d - %d\n", i, sum);
        fun(i+1, n, sum);

    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("printing and displaying sum in each call o to n number");
        System.out.println("------------------");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fun(0, n, 0);

        sc.close();
    }
}
