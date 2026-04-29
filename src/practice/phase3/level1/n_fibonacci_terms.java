package practice.phase3.level1;
import java.util.Scanner;

public class n_fibonacci_terms {
    public static void fibonnacci(int n){
        if(n == 1){
            System.out.print("1, ");

        }
        if(n == 0){
            System.out.print("0, ");
            return 0;
        }

        return fibonnacci(n-1) + fibonnacci(n-2);
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("n fibonacci terms");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.printf("%d, %d, ", a, b);

        for(int i = 2; i<n; i++){
            int temp = b + a;
            System.out.printf("%d, ", temp);
            a = b;
            b = temp;
        }

        System.out.println();

        int num = fibonnacci(n);
        System.out.printf("%d, ", num);

        sc.close();
    }
}
