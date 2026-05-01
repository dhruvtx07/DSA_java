package practice.phase4.level2;
import java.util.ArrayList;
import java.util.Scanner;

public class check_if_all_elements_are_unique {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("check if all characters are unique or not in an array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        boolean flag = false;

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i != j){
                    if(nums[i] == nums[j]){
                        flag = true;
                        continue;
                    }
                }

            }
        }

        System.out.println(flag);

        sc.close();
    }
}
