package practice.phase3.level1;
import java.util.Scanner;

public class print_nth_fibbonacci_number {
    public static int fibonnacci(int a, int b, int sum, int i, int n){
        if(i == n){
            return 0;
        }
        int temp = b + a;
        int ans = fibonnacci(b, temp, temp, i+1, n);
        return ans;
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("nth fibonacci number");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.printf("%d, %d \n", a, b);

        for(int i = 2; i<=n; i++){
            int temp = b + a;
            System.out.printf("temp %d - %d \n", i, temp);
            b = temp;
            a = b;
        }

        /*
        System.out.println();

        int num = fibonnacci(a, b, 0, 1, n);
        System.out.println(num);
        */
        sc.close();
    }
}
