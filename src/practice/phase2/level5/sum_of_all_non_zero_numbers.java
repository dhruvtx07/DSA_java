package practice.phase2.level5;
import java.util.Scanner;

public class sum_of_all_non_zero_numbers {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("sum of numbers");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        for(int i = 0; i< nums.length; i++ ){
            System.out.printf("Enter %d number: ", i+1);
            nums[i] = sc.nextInt();
            if(nums[i] > 0){
                sum += nums[i];
            }
        }
        System.out.printf("sum of all non zero numbers is: %d", sum);

        sc.close();
    }
}
