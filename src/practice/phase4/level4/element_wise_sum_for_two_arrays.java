package practice.phase4.level4;
import java.util.Scanner;

public class element_wise_sum_for_two_arrays {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("element wise sum for two arrays");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];
        int[] nums2 = new int[5];


        System.out.println("for array 1");
        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("for array 2");
        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums2[i] = sc.nextInt();
        }

        System.out.println("array 1");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        System.out.println("\narray 2");
        for(int i : nums2){
            System.out.printf("%d, ", i);
        }
        System.out.println();
        System.out.println();
        for(int i = 0; i<nums.length; i++) {
            System.out.printf("%d, ", nums[i]+nums2[i]);
        }

        sc.close();
    }
}
