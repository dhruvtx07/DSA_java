package practice.phase4.level3;
import java.util.*;

public class replacing_odd_with_1_and_even_with_0 {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("replacing odd with 1 and even with 0 ");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            if(nums[i]%2 ==  0){
                nums[i] = 0;
            }else{
                nums[i] = 1;
            }

        }

        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        sc.close();
    }
}
