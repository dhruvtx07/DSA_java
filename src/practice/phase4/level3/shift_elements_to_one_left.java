package practice.phase4.level3;
import java.util.*;

public class shift_elements_to_one_left {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("rotating array to 1 left - shifting to one left");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("array before rotating");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }
        int first = nums[0];
        int length = nums.length;

        for(int i = 0; i<length; i++){
            if(i == length-1){
                nums[i] = first;
                break;
            }
            nums[i] = nums[i+1];
        }

        System.out.println("\narray after rotating");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        sc.close();
    }
}
