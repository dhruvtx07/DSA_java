package practice.phase4.level4;
import java.util.Scanner;

public class counting_common_elements_in_array {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("counting common elements");
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
        int common = 0;

        for(int i = 0; i<nums.length; i++) {
            boolean flag = false;
            for(int j = 0; j<nums.length; j++) {
                if(nums[i] == nums2[j]){
                    flag = true;
                }
            }
            if(flag){
                System.out.printf("%d is common\n", nums[i]);
            }
            flag = false;
        }

        sc.close();
    }
}
