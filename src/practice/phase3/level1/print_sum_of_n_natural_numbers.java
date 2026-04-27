package practice.phase3.level1;
import java.util.Scanner;

public class print_sum_of_n_natural_numbers {
    public static int sumOfNNaturalNumbers(int n){
        int sum = n;
        if(n==1){
            return 1;
        }
        return sum + sumOfNNaturalNumbers(n-1);
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("printing sum of n natural numbers");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter last number: ");
        int n = sc.nextInt();

        int sum = sumOfNNaturalNumbers(n);
        System.out.println(sum);

        sc.close();
    }
}
