package practice.phase2.level2;
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("Fibonacci Series");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 0; i<num; i++){
            System.out.printf("%d, ", a);
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
