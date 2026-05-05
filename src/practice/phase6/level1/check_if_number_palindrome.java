package practice.phase6.level1;
import java.util.*;

public class check_if_number_palindrome {
    public static void main(String[] args){
        System.out.println("check if number is palindrome or not");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int num2 = 0;
        while(temp>0){
            int digit = temp%10;
            num2 = num2*10+ digit;
            temp/=10;
        }
        if(num == num2){
            System.out.print("valid palindrome number");
        }else{
            System.out.print("invalid");
        }

        sc.close();
    }
}
