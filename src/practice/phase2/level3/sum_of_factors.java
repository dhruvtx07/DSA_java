package practice.phase2.level3;
import java.util.Scanner;

public class sum_of_factors {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("sum of factors");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;


        System.out.printf("factors of %d are: ", num);


        for(int i = 1; i<=num/2; i++){
            if(num % i == 0){
                System.out.printf("%d ,", i);
                sum = sum + i;
            }
        }
        sum = sum + num;

        System.out.printf("%d \n", num);
        System.out.printf("sum of factors of %d are: %d", num, sum);


        sc.close();
    }
}
