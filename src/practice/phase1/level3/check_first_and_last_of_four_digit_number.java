package practice.phase1.level3;
import java.util.Scanner;

public class check_first_and_last_of_four_digit_number {


    public static void main(String[] args){

        System.out.println("--------------");
        System.out.println("check if first and last digits are same of a four digit number");
        System.out.println("--------------");


        System.out.print("enter a four digit number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit1 = num % 10; //last digit
        int digit2 = (num/10) % 10; //second last digit
        int digit3 = (num/100) % 10; // third last digit
        int digit4 = num/1000; // last digit

        if(digit1 == digit4){
            System.out.println("digits 1 and digit 4 are same");
        }else{
            System.out.println("not same");
        }

        sc.close();
    }

}
