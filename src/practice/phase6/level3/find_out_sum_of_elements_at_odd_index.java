package practice.phase6.level3;
import java.util.Scanner;

public class find_out_sum_of_elements_at_odd_index {
    public static void main(String[] args) {
        System.out.println("find second largest element in array");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("enter value for %d index: ", i);
            nums[i] = sc.nextInt();
            if(i%2 != 0){
                sum += nums[i];
            }
        }

        System.out.println(sum);


        sc.close();
    }
}
