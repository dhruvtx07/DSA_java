package practice.phase3.level2;
import java.util.Scanner;

public class sum_of_first_n_even_numbers {
    public static int fun(int n, int ans){
        if(n==0){
            return ans;
        }
        ans = ans + 2 * n;
        return fun(n-1, ans);
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Sum of first n even numbers using recursion");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();



        int num = fun(n, 0);
        System.out.println();

        System.out.println(num);

        sc.close();
    }
}
