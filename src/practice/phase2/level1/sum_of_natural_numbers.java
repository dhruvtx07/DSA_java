package practice.phase2.level1;
import java.util.Scanner;

public class sum_of_natural_numbers {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("sum of n natural numbers");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int total = 0;
        for(int i =1; i<=num;i++){
            total = total + i;
        }
        System.out.println();
        System.out.printf("sum of %d terms is: %d", num, total);

        System.out.println();
        int totalSum = (num*(2*1+(num - 1)*1)/2);
        System.out.printf("sum of %d terms via AP (n*(2*first_term+(n terms - 1)*common_difference)/2) is: %d", num, totalSum);

        System.out.println();
        int totalSum2 = (num*(1+num)/2);
        System.out.printf("sum of %d terms via AP (num*(1+num)/2) is: %d", num, totalSum2);


        sc.close();
    }
}
