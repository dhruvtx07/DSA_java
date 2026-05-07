package practice.phase6.level4;
import java.util.*;

public class fibonacci_series_using_recursion {
    public static void fun(int n, int a, int b){
        if(n == 0){
            return;
        }
        System.out.printf("%d, ", a);
        fun(n-1, b, a+b);
    }
    public static void main(String[] args){
        System.out.println("fibonacci using recursion");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of terms: ");
        int n = sc.nextInt();

        fun(n, 0, 1);


        sc.close();
    }
}
