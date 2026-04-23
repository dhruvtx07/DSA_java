package practice.phase1.level3;
import java.util.Scanner;

public class numer_distinction_in_three_digit_number {
    public static void main(String[] args){

        System.out.println("--------------");
        System.out.println("check if all three digits are distinct");
        System.out.println("--------------");


        System.out.print("enter a three digit number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit1 = num % 10; //last digit
        int digit2 = (num/10) % 10; //second last digit
        int digit3 = num/100;

        if(digit1 == digit2 || digit2 == digit3 || digit1 == digit3){
            System.out.println("digits are not distinct");
        }else{
            System.out.println("digits are distinct");
        }

        sc.close();
    }
}
