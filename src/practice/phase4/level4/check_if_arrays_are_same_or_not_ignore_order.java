package practice.phase4.level4;
import java.util.Scanner;

public class check_if_arrays_are_same_or_not_ignore_order {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("checking if both arrays contains same elements");
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

        boolean flag = false;
        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<nums.length; j++) {
                if(nums[i] == nums2[j]){
                    System.out.printf("index i- %d j-%d - array 1 -> %d - array 2 -> %d \n", i, j, nums[i], nums2[j]);
                    flag = true;
                }
            }
        }

        if(!flag){
            System.out.println("arrays are not same");
        }
        sc.close();
    }
}
