package practice.phase6.level1;
import java.util.*;

public class armstrong_number {
    public static void main(String[] args){
        System.out.println("check if number is armstrong number");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int counter = 0;

        while(temp>0){
            int digit = temp % 10;
            counter++;
            temp /=10;
        }

        int temp2 = num;

        int result = 1;
        int sum = 0;
        while(temp2>0){
            int digit = temp2%10;
            for(int i = 1; i<=counter; i++){
                result = result * digit;
            }
            temp2/=10;
            sum = sum + result;
            result = 1;
        }
        if(sum == num){
           System.out.print("valid armstrong number");
        }else{
            System.out.print("not an armstrong number");
        }

        sc.close();
    }
}
