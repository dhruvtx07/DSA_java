package practice.phase2.level1;
import java.util.Scanner;

public class sum_of_odd_numbers {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("sum of n odd numbers");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int total = 0;
        for(int i =1; i<=num;i++){
            System.out.printf("current total: %d + %d = ", total, ((2*i)-1));
            total = total + ((2*i)-1);
            System.out.println(total);
        }
        System.out.println();
        System.out.printf("sum of %d odd numbers is: %d", num, total);

        sc.close();
    }
}
