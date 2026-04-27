package practice.phase3.level1;
import java.util.Scanner;

public class print_factorial_using_recursion {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void printFactorial(int n, int sum){
        if(n == 1){
            System.out.println(sum);
            return;
        }
        printFactorial(n-1, sum*n);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("factorial using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int factorial = factorial(n);
        System.out.println(factorial);

        printFactorial(n, 1);

        sc.close();
    }
}
