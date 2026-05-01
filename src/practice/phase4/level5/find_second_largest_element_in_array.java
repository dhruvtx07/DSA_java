package practice.phase4.level5;
import java.util.Scanner;

public class find_second_largest_element_in_array {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("find second largest element in array");
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
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println("\nafter swapping");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        System.out.println();
        System.out.println();

        System.out.printf("%d ", nums[3]);

        sc.close();
    }
}
