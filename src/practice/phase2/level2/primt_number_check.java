package practice.phase2.level2;
import java.util.Scanner;

public class primt_number_check {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("prime number checker");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i<=num /2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("not a prime");
        }

        sc.close();
    }
}
