package practice.phase6.level3;
import java.util.*;

public class find_second_largest_element {
    public static void main(String[] args){
        System.out.println("find second largest element in array");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i<nums.length; i++) {
            for(int j = i+1; j< nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        System.out.println();
        System.out.printf("%d", nums[3]);

        sc.close();
    }
}
