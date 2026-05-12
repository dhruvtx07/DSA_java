package practice.sorting;
import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args){
        System.out.println("bubble sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        for(int j = nums.length - 1; j>=0; j--){
            int k = 0;
            boolean swapped = false;
            while(k<j){
                if(nums[k] > nums[k+1] ){
                    int temp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = temp;
                    swapped = true;
                }
                k++;
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
