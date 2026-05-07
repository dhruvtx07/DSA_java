package practice.phase6.level4;
import java.util.*;

public class check_how_many_appears_consecutively {
    public static void main(String[] args){
        System.out.println("check how many elements appears consecutively");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        int streak = 1;
        for(int i =0; i<nums.length-1; i++){
            int current = nums[i];
            int next = nums[i+1];
            if(current == next){
                streak++;
            }else{
                System.out.printf("%d appeared %d times\n", current, streak);
                streak = 1;
            }
            if(i==nums.length-2){
                System.out.printf("%d appeared %d times\n", current, streak);
            }
        }

        sc.close();
    }
}
