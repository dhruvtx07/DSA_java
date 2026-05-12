package practice.sorting;
import java.util.*;

public class selection_sort {
    public static void main(String[] args){
        System.out.println("Selection sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        for(int j = 0; j<nums.length-1; j++){
            int min_index = j;
            for(int k = j+1; k<nums.length; k++){
                if(nums[min_index]>nums[k]){
                    min_index = k;
                }
            }
            int temp = nums[min_index];
            nums[min_index] = nums[j];
            nums[j] = temp;
        }

        for(int num: nums){
            System.out.printf("%d, ", num);
        }

        sc.close();
    }

}
