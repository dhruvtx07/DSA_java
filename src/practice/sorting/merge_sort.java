package practice.sorting;
import java.util.*;

public class merge_sort {
    public static void sort(int[] nums, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

            while(i<=mid && j<=high){
                if(nums[i]<=nums[j]){
                    temp.add(nums[i]);
                    i++;
                }else{
                    temp.add(nums[j]);
                    j++;
                }
            }
            while(i<=mid){
                temp.add(nums[i]);
                i++;
            }
            while(j<=high){
                temp.add(nums[j]);
                j++;
            }


        for(int k = low; k<=high; k++ ){
            nums[k] = temp.get(k-low);
        }
    }
    public static void ms(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high - low)/2;

        ms(nums, low, mid);
        ms(nums, mid+1, high);

        sort(nums, low, mid, high);

    }
    public static void main(String[] args){
        System.out.println("merge sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }
        ms(nums, 0, nums.length-1);

        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        sc.close();
    }
}
