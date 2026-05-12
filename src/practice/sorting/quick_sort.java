package practice.sorting;
import java.util.Scanner;

public class quick_sort {
    public static int sort(int[] nums, int low, int high){
        int pivot = low;
        int i = low;
        int j = high;
        while(i<j){
            while(nums[i]<nums[pivot]){
                i++;
            }
            while(nums[j]>nums[pivot]){
                j--;
            }
            if(i<j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[j];
        nums[j] = nums[pivot];
        nums[pivot] = temp;

        return j;
    }
    public static void qs(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int mid = sort(nums, low, high);
        qs(nums, low, mid);
        qs(nums, mid+1, high);
    }
    public static void main(String[] args){
        System.out.println("quick sort");
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }
        qs(nums, 0, nums.length-1);

        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        sc.close();
    }
}
