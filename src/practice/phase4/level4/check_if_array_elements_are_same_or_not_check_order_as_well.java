package practice.phase4.level4;
import java.util.Scanner;

public class check_if_array_elements_are_same_or_not_check_order_as_well {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("checking if both arrays contains same elements and order");
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

        System.out.println("\nchecking match");

        boolean flag = true;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != nums2[i]){
                System.out.printf("index %d - array 1 -> %d - array 2 -> %d \n", i, nums[i], nums2[i]);
                flag = false;
            }
        }

        if(!flag){
            System.out.println("arrays are not same");
        }
        sc.close();
    }
}
