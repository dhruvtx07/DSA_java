package practice.phase4.level2;
import java.util.Scanner;

public class checking_divisibility_by_3_and_5 {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("checking divisibility of array elements with 3 and 5");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();

            if (nums[i]%3 == 0 && nums[i]%5 == 0) {
                System.out.printf("%d is divisible by 3 ad 5\n", nums[i]);
            }
        }


        sc.close();
    }
}
