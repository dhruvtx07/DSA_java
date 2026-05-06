package practice.phase6.level3;
import java.util.Scanner;

public class find_min_and_max_from_array {
    public static void main(String[] args){
        System.out.println("find min and max from an array");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            if(i == 0){
                min = nums[0];
                max = nums[0];
            }
            if(max<nums[i]){
                max = nums[i];
            }
            if(min>nums[i]){
                min = nums[i];
            }
        }

        System.out.printf("min %d - max %d", min, max);



        sc.close();
    }
}
