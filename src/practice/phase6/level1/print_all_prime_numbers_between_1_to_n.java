package practice.phase6.level1;
import java.util.*;

public class print_all_prime_numbers_between_1_to_n {
    public static void main(String[] args){
        System.out.println("print all prime numbers 1 to n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = sc.nextInt();


        int factor = 0;
        for(int num = 1; num<=n; num++){
            if(num == 1){
                continue;
            }
            for(int i = 2; i*i<=num; i++){
                if(num % i == 0){
                    factor+=1;
                }
            }
            if(factor==0){
                System.out.printf("%d is prime\n", num);
            }
            factor=0;
        }


        sc.close();
    }
}
