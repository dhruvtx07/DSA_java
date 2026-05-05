package practice.phase6.level1;
import java.util.*;

public class sum_of_digits {
    public static void main(String[] args){
        System.out.println("finding sum of digits\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum += digit;
            temp/=10;
        }

        System.out.println(sum);
        sc.close();
    }
}
