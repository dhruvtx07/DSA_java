package practice.phase2.level5;
import java.util.Scanner;

public class sum_of_digits_are_multiple_of_3_or_not {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("sum of digits are multiple of 3 or not");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter last number: ");
        int last = sc.nextInt();

        for(int i = first; i<=last; i++){

            int tempNum = i;
            int sum = 0;
            while(tempNum>0){
                int digit = tempNum % 10;
                sum = sum + digit;
                tempNum /= 10;
            }
            if(sum % 3 == 0){
                System.out.printf("%d - sum of digits - %d - is multiple of 3 \n", i, sum);
            }
        }

        sc.close();
    }
}
