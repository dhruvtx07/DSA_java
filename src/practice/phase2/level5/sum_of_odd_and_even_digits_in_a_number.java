package practice.phase2.level5;
import java.util.Scanner;

public class sum_of_odd_and_even_digits_in_a_number {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("sum of odd and even in a number");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int tempNum = n;
        int oddDigitSum = 0;
        int evenDigitSum = 0;


        while(tempNum>0){
            int digit = tempNum % 10;
            if(digit % 2 == 0){
                System.out.printf("%d - even\n", digit);
                evenDigitSum += digit;
            }else{
                System.out.printf("%d - odd\n", digit);
                oddDigitSum += digit;
            }
            tempNum /= 10;
        }
        System.out.printf("sum of even digits - %d\n", evenDigitSum);
        System.out.printf("sum of odd digits - %d\n", oddDigitSum);

        sc.close();
    }
}
