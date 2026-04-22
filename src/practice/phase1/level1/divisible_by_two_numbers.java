package practice.phase1.level1;
import java.util.Scanner;

public class divisible_by_two_numbers {
    public static void main(String[] args){
        System.out.println("-----------------------");
        System.out.println("Enter a number to check its divisibility by 3 and 5");
        System.out.println("-----------------------");

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean divisibleByThree = (num%3==0);
        boolean divisibleByFive = (num%5==0);


        if(divisibleByThree && divisibleByFive){
            System.out.println("Number is divisible by both 3 and 5");
        }else if(divisibleByThree){
            System.out.println("Number is divisible by 3");
        }else if(divisibleByFive){
            System.out.println("Number is divisible by 5");
        }else{
            System.out.println("Number is not divisible by any");
        }

        sc.close();
    }
}
