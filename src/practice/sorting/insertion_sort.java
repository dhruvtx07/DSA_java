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

        for(int i = 1; i<nums.length; i++){
            int k = 0;
            while(k<=i){
                if(){}
                k++;
            }
        }

        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        sc.close();
    }
}
