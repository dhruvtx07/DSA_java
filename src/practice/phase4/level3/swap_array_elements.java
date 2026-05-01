package practice.phase4.level3;
import java.util.*;

public class swap_array_elements {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("swapping array elements");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("array before swap");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }
        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }

        System.out.println("\narray after swap");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        sc.close();
    }
}
