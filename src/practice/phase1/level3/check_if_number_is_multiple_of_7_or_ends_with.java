package practice.phase1.level3;
import java.util.Scanner;

public class check_if_number_is_multiple_of_7_or_ends_with {
    public static void main(String[] args){

        System.out.println("---------------");
        System.out.println("checking if number is divisible by 7 or ends with 7");
        System.out.println("---------------");


        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if((num%7 == 0) && (num%10 == 7)){
            System.out.println("Number is divisible by 7 and ends with 7");
        }else if((num%7 == 0)){
            System.out.println("Number is divisible by 7 ");
        }else if((num%10 == 7)){
            System.out.println("Number ends with 7");
        }else{
            System.out.println("nothing");
        }
        sc.close();
    }
}
