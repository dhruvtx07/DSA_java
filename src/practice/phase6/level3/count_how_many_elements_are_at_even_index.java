package practice.phase6.level3;
import java.util.*;

public class count_how_many_elements_are_at_even_index {
    public static void main(String[] args){
        System.out.println("count how many elements are at even index");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i< nums.length; i++){
            if(i%2==0){
                System.out.printf("%d - even - %d index\n",i, nums[i]);
            }else{
                System.out.printf("%d \n",nums[i]);
            }
        }

        sc.close();
    }
}
