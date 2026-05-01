package practice.phase4.level2;
import java.util.Scanner;

public class checking_perfect_square_elements_in_array {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("checking perfect square numbers in array");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();

            for (int j = 1; j * j <= nums[i]; j++) {
                if (nums[i] ==  j*j) {
                    System.out.printf("%d is perfect square \n", nums[i]);
                }
            }
        }


        sc.close();
    }
}
