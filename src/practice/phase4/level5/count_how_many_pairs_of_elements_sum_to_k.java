package practice.phase4.level5;
import java.util.Scanner;

public class count_how_many_pairs_of_elements_sum_to_k {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count how many pairs of elements of array element sum to k");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.printf("enter k: ");
        int k = sc.nextInt();


        int[] nums = new int[5];

        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("\nArray\n");
        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        System.out.println();
        System.out.println();



        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                if(nums[i]+nums[j] == k){
                    System.out.printf("index i - %d index j - %d\n%d + %d = %d\n",i, j, nums[i], nums[j], nums[i]+nums[j]);
                }
            }
        }


        sc.close();
    }
}
