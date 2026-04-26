package practice.phase2.level5;
import java.util.Scanner;

public class all_numbers_one_to_hundred_whose_sum_of_digits_is_even {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("printing numbers whose sum of digits is even");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter last number: ");
        int last = sc.nextInt();

        for(int i = first; i<=last; i++){
            int sum = 0;
            System.out.printf("%d - ", i);

            int tempNum = i;
            while(tempNum>0){
                int digit = tempNum % 10;
                sum += digit;
                tempNum /=10;
            }
            System.out.printf("%d", sum);
            if(sum % 2 == 0){
                System.out.printf(" - even sum\n");
            }else{
                System.out.println();
            }

        }

        sc.close();
    }
}
