package practice.phase6.level4;
import java.util.ArrayList;
import java.util.Scanner;

public class print_all_pairs_in_array_whose_sum_equals_k {
    public static void main(String[] args){
        System.out.println("printing all pairs in an array whose sum equals K");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter K: ");
        int K = sc.nextInt();

        int[] nums = new int[5];
        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("finding pairs with sum equal to K");
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j< nums.length; j++) {
                if(i != j){
                    if(K == nums[i] + nums[j]){
                        System.out.printf("%d + %d = %d\n", nums[i], nums[j], K);
                    }
                }
            }
        }


        sc.close();
    }
}
