package practice.phase6.level4;
import java.util.Scanner;

public class check_if_array_is_sorted {
    public static void main(String[] args){
        System.out.println("check if array is sorted");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0;i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        boolean asc = false;
        boolean desc = false;
        for(int i = 0;i< nums.length-1; i++){
            if(asc && desc){
                break;
            }
            int current = nums[i];
            int next = nums[i+1];
            if(current<next){
                asc = true;
            }else{
                desc = true;
            }
        }
        if(asc && desc){
            System.out.println("array is not sorted");
        }else{
            if(asc){
                System.out.println("array is sorted in ascending order");
            }else{
                System.out.println("array is sorted in descending order");
            }
        }
        sc.close();
    }
}
