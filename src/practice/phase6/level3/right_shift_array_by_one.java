package practice.phase6.level3;
import java.util.*;

public class right_shift_array_by_one {
    public static void main(String[] args){
        System.out.println("right shift array by one position");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("before rotation");
        for(int i = 0; i< nums.length; i++){
            System.out.printf("%d, ", nums[i]);
        }

        int num = nums[nums.length-1];
        for(int i = nums.length-1; i>=0; i--){
            if(i == 0){
                nums[i] = num;
            }else{
                nums[i] = nums[i-1];
            }
        }

        System.out.println("\nafter rotation");
        for(int i = 0; i< nums.length; i++){
            System.out.printf("%d, ", nums[i]);
        }


        sc.close();
    }
}
