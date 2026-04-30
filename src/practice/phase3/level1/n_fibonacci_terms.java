package practice.phase3.level1;
import java.util.Scanner;

public class n_fibonacci_terms {
    public static void fibonnacci(int n, int a, int b){
        if(n == 0) return;
        System.out.printf("%d, ", a);
        fibonnacci(n-1, b, a+b);
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("n fibonacci terms");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println();

        fibonnacci(n, 0, 1);
        // System.out.printf("%d, ", num);

        sc.close();
    }
}
