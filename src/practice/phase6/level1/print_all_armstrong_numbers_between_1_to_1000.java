package practice.phase6.level1;
import java.util.*;

public class print_all_armstrong_numbers_between_1_to_1000 {
    public static void main(String[] args){
        System.out.println("finding out armstrong numbers between 1 and 1000");

        for(int i = 1; i<=1000; i++){
            int num = i;
            int temp = num;
            int temp2 = num;

            int power = 0;
            while(temp>0){
                power++;
                temp/=10;
            }

            int sum = 0;
            int result = 1;
            while(temp2>0){
                int digit = temp2 % 10;

                for(int j = 1; j<=power; j++){
                    result = result * digit;
                }

                sum += result;
                result = 1;
                temp2/=10;
            }
            if(sum == num){
                System.out.println(num);
            }else{
                System.out.printf("%d is not armstrong\n", num);
            }

        }
    }
}
