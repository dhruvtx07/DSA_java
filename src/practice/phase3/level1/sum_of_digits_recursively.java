package practice.phase3.level1;
import java.util.Scanner;

public class sum_of_digits_recursively {

    public static int sum(int num, int sum){
        if(num<=0){
            return sum;
        }
        sum = sum + num%10;
        return sum(num/10,sum);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Sum of digits using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = sum(num, 0);
        System.out.println(sum);

        sc.close();
    }
}
