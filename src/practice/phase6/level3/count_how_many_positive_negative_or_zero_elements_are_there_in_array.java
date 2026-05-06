package practice.phase6.level3;
import java.util.Scanner;

public class count_how_many_positive_negative_or_zero_elements_are_there_in_array {
    public static void main(String[] args){
        System.out.println("counting how many numbers are positive, negative or zero in an array");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            if(nums[i] == 0){
                zero++;
            }
            else if(nums[i]>0){
                positive++;
            }else{
                negative++;
            }
        }

        System.out.printf("%d zero, %d positive, %d negative", zero, positive, negative);

        sc.close();
    }
}
