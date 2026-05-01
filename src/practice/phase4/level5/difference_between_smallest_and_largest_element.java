package practice.phase4.level5;

import java.util.Scanner;

public class difference_between_smallest_and_largest_element {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("find difference between largest and smallest element in array");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter element for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("\nbefore swapping");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("after swapping");

        for(int num : nums){
            System.out.printf("%d, ", num);
        }
        System.out.println();

        System.out.printf("%d - %d = %d", nums[4], nums[0], nums[4]-nums[0]);


        sc.close();
    }
}
