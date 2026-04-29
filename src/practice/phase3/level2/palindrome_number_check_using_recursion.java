package practice.phase3.level2;
import java.util.Scanner;

public class palindrome_number_check_using_recursion {

    public static int reverse(int num, int temp){
        if(num<=0){
            return temp;
        }
        int digit = num%10;
        temp = temp * 10 + digit;
        return reverse(num/10,temp);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("palindrome number using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = reverse(num, 0);

        System.out.println(reverse);

        if(num == reverse){
            System.out.println("palindrome number");
        }else{
            System.out.println("not a palindrome");
        }

        sc.close();
    }
}
