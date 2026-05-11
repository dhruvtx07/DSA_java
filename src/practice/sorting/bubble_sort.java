package practice.sorting;
import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args){
        System.out.println("bubble sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i< nums.length; i++){
            boolean swapped = false;
            for(int j = 0; j< nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                    swapped  = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for(int num : nums){
            System.out.printf("%d, ", num);
        }


        sc.close();
    }
}
