package practice.sorting;
import java.util.Scanner;

public class quick_sort {
    public static int sort(int[] nums, int low, int high){
        int pivot = low;
        int i = low;
        int j = high;

        while(i < j){
            while(nums[i] <= nums[pivot] && i <= high-1){
                i++;
            }
            while(nums[j]> nums[pivot] && j >= low+1){
                j--;
            }
            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[pivot];
        nums[pivot] = nums[j];
        nums[j] = temp;

        return j;
    }
    public static void qs(int[] nums, int low, int high){
        if(low>=high){
            return;
        }

        int partition = sort(nums, low, high);
        qs(nums, low, partition-1);
        qs(nums, partition+1, high);
    }
    public static void main(String[] args){
        System.out.println("quick sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        qs(nums, 0, nums.length-1);

        System.out.println("sorted array using merge sort");
        for(int num : nums){
            System.out.printf("%d, ", num);
        }



        sc.close();
    }
}
