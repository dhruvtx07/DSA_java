package practice.sorting;
import java.util.*;

public class merge_sort {
    public static void sort(int[] nums, int start, int mid, int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int middle = mid+1;
        int originalStart = start;
        while(start <= mid && middle <= end){
            if(nums[start]<= nums[middle]){
                temp.add(nums[start]);
                start++;
            }else{
                temp.add(nums[middle]);
                middle++;
            }
        }
        while(start<=mid){
            temp.add(nums[start]);
            start++;
        }
        while(middle<=end){
            temp.add(nums[middle]);
            middle++;
        }
        for(int i = originalStart; i<=end; i++){
            nums[i] = temp.get(i - originalStart);
        }
    }

    public static void qs(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int last = nums.length-1;
        int mid = start + (end - start)/2;

        qs(nums, start, mid);
        qs(nums, mid+1, end);

        sort(nums, start, mid, end);
    }
    public static void main(String[] args){
        System.out.println("merge sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        qs(nums, 0, nums.length-1);

        for(int i = 0; i< nums.length; i++){
            System.out.printf("%d, ", nums[i]);
        }

        sc.close();
    }
}
