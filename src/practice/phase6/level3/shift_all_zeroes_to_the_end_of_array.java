package practice.phase6.level3;
import java.util.*;

public class shift_all_zeroes_to_the_end_of_array {
    public static void main(String[] args){
        System.out.println("move zeroes to the end");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        int position = 0;

        // Step 1: Move non-zero elements forward
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[position] = nums[i];
                position++;
            }
        }

        // Step 2: Fill remaining positions with 0
        for(int i = position; i < nums.length; i++){
            nums[i] = 0;
        }

        // Print result
        for(int num : nums){
            System.out.print(num + " ");
        }

        sc.close();
    }
}