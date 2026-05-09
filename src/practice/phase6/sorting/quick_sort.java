package practice.phase6.sorting;
import java.util.*;

public class quick_sort {

    public static int[] qs(int[] nums, int start, int end){
        if(start == end){
            return nums;
        }
        int mid = end+start/2;

        qs(nums, start, mid);
        qs(nums, mid+1, end);

        sort(nums, start, mid, end);

        return nums;
    }
    public static void main(String[] args){
        System.out.println("quick sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }




        sc.close();
    }
}
