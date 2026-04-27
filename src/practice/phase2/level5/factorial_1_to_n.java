package practice.phase2.level5;
import java.util.Scanner;

public class factorial_1_to_n {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Printing factorial 1 to n in each line");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter last number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            int factorial = 1;
            System.out.printf("%d -> ", i);
            for(int j = i; j>=1; j--){
                System.out.printf("%d * ", j);
                factorial = factorial * j;
            }
            System.out.printf("= %d ", factorial);
            System.out.println();
        }

        sc.close();
    }
}
