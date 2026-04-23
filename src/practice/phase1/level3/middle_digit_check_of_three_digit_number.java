package practice.phase1.level3;
import java.util.Scanner;

public class middle_digit_check_of_three_digit_number {

    public static void main(String[] args){

        System.out.println("--------------");
        System.out.println("check if middle digit is largest or smallest or none");
        System.out.println("--------------");


        System.out.print("enter a three digit number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit1 = num % 10; //last digit
        int digit2 = (num/10) % 10; //second last digit
        int digit3 = num/100;

        if(digit2 > digit3 && digit2 > digit1){
            System.out.println("digits 2 is the largest");
        }else if(digit2 < digit3 && digit2 < digit1){
            System.out.println("digits 2 is the smallest");
        }else{
            System.out.println("middle is not the smallest or the greatest");
        }

        sc.close();
    }
}
