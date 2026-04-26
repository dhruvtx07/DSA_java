package practice.phase2.level2;
import java.util.Scanner;

public class print_prime_till_n {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("print prime numbers till n");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last number: ");
        int num = sc.nextInt();

        for(int i= 2; i<=num; i++){
            boolean isPrime = true;
            for(int j = 2; j*j<=i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }


        sc.close();

    }
}
