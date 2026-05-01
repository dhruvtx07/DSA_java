package practice.phase4.level3;
import java.util.*;

public class swap_alternate_elements {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("swapping alternate array elements");
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

        for(int i = 0; i<= nums.length-2; i+=2){
            int idx = i;
            int idx2 = i + 1;

            int temp = nums[idx];
            nums[idx] = nums[idx2];
            nums[idx2] = temp;
        }

        System.out.println("\narray after swap");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        sc.close();
    }
}
