package practice.phase4.level3;
import java.util.*;

public class copy_array_to_another {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("copying array to another array manually");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];
        int[] nums2 = new int[5];


        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            nums2[i] = nums[i];
        }

        System.out.println("array 1");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        System.out.println("\narray 2");
        for(int i : nums2){
            System.out.printf("%d, ", i);
        }

        sc.close();
    }
}
