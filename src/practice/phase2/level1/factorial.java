package practice.phase2.level1;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("factorial");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        int factorial = 1;

        for(int i=num; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.printf("factorial: %d", factorial);
        sc.close();
    }
}
