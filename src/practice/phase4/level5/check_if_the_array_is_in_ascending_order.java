package practice.phase4.level5;

import java.util.Scanner;

public class check_if_the_array_is_in_ascending_order {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("checking if array is in ascending order");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("for array 1");
        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("array 1");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        System.out.println();
        System.out.println();

        boolean flag = true;

        for(int i = 0; i<=nums.length-2; i++) {
            if(nums[i]>nums[i+1]){
                flag = false;
            }
        }

        if(!flag){
            System.out.println("arrays is not in ascending order");
        }else{
            System.out.println("arrays is in ascending order");
        }

        sc.close();
    }
}
