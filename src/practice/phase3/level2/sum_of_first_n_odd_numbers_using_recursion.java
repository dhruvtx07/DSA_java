package practice.phase3.level2;
import java.util.Scanner;

public class sum_of_first_n_odd_numbers_using_recursion {
    public static int fun(int n, int sum){
        if(n==0){
            return sum;
        }
        sum = sum + (2*n-1);
        System.out.println(sum);
        return fun(n-1, sum);
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("sum of n odd numbers using recursion");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = fun(n, 0);
        System.out.println();
        System.out.println(sum);

        sc.close();
    }
}
