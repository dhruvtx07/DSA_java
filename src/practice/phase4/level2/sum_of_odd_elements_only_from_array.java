package practice.phase4.level2;
import java.util.Scanner;

public class sum_of_odd_elements_only_from_array {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("sum of odd array elements only");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            if(nums[i]%2!=0){
                sum = sum + nums[i];
                System.out.printf("odd - sum -> %d\n", sum);
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
