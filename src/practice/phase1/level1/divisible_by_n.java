package practice.phase1.level1;
import java.util.Scanner;


public class divisible_by_n {
    public static void main(String[] args){
        System.out.println("-------------");
        System.out.println("Number divisble by check");
        System.out.println("-------------");

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("--------------------");
        System.out.print("Enter a number to check divisibility: ");
        int numDivisibleBy = sc.nextInt();


        if(num%numDivisibleBy==0){
            System.out.printf("%d is divisible by %d", num, numDivisibleBy);
        }else{
            System.out.printf("%d is not divisible by %d", num, numDivisibleBy);
        }

        sc.close();
    }
}
