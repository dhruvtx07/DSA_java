package practice.phase6.sorting;
import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args){
        System.out.println("selection sort");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d element: ", i+1);
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i< nums.length; i++){
            int min_index = i;
            for(int j = i+1; j< nums.length; j++){
                if(nums[j]<nums[min_index]){
                    min_index = j;
                }
            }
            int temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }

        System.out.println("sorted array using selection sort");
        for(int i = 0; i< nums.length; i++){
            System.out.printf("%d, ", nums[i]);
        }



        sc.close();
    }
}
