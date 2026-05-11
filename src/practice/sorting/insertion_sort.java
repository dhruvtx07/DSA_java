package practice.sorting;
import java.util.*;

public class insertion_sort {
    public static void main(String[] args){
        System.out.println("insertion sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i< nums.length; i++){
            int j = i;
            while(j>=1 && (nums[j-1]> nums[j])){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
                System.out.println("runs");
            }
        }

        System.out.println("printing sorted array using insertion sort");
        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        sc.close();
    }
}
