package practice.phase2.level2;
import java.util.Scanner;

public class sum_of_n_fibonacci {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("n fibonacci terms sum");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        int sum = 0;

        for(int i = 1; i<=n; i++){
            System.out.println(a);
            sum = sum + a;

            System.out.printf("current sum: %d\n", sum);

            int next = a + b;
            a = b;
            b = next;



        }

        sc.close();
    }
}
