package practice.phase6.searching;
import java.util.Scanner;

public class binary_search {

    public static int find(int[] nums, int low, int high, int target){
        if(low>=high){
            return -1;
        }
        int mid = low + (high-low) / 2;

        if(nums[mid] == target){
            return mid;
        }else if(nums[mid]< target){
            return find(nums, mid+1, high, target);
        }else{
            return find(nums, low, mid-1, target);
        }
    }

    public static void main(String[] args){
        System.out.println("binary search");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value at %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.print("\nenter number to look for: ");
        int target = sc.nextInt();

        int idx = find(nums, 0, nums.length-1, target);

        if(idx == -1){
            System.out.println("element not found");
        }else{
            System.out.printf("%d found at %d index", nums[idx], idx);
        }

        sc.close();
    }
}
