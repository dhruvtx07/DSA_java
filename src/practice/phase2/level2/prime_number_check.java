package practice.phase2.level2;
import java.util.Scanner;

public class prime_number_check {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("prime number checker");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int countFactors = 0;

        for(int i = 1; i*i<=num; i++){
            if(num % i == 0){
                countFactors++;
            }
        }

        if(countFactors<2){
            System.out.println("prime");
        }else{
            System.out.println("not a prime");
        }

        sc.close();
    }
}
