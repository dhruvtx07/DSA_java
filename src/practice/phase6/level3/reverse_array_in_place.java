package practice.phase6.level3;
import java.util.*;

public class reverse_array_in_place {
    public static void main(String[] args){
        System.out.println("reverse array in place");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[6];

        for(int i = 0; i< nums.length;i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int lowNum = nums[low];
            int highNum = nums[high];

            nums[low] = highNum;
            nums[high] = lowNum;

            low++;
            high--;
        }

        for(int num: nums){
            System.out.printf("%d, ", num);
        }
        sc.close();
    }
}
