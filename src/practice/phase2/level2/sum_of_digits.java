package practice.phase2.level2;
import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("sum of digits");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int tempNum = num;

        while(tempNum>0){
            int digit = tempNum%10;
            sum = sum + digit;
            tempNum = tempNum/10;
        }

        System.out.printf("%d sum of digits: %d", num, sum);

        sc.close();
    }
}
