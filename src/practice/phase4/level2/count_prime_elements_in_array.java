package practice.phase4.level2;
import java.util.Scanner;

public class count_prime_elements_in_array {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count number of prime numbers in array");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            boolean flag = true;
            if (nums[i] <= 1) {
                flag = false;
            } else {
                for (int j = 2; j * j <= nums[i]; j++) {
                    if (nums[i] % j == 0) {
                        flag = false;
                    }
                }
            }

            if(flag){
                System.out.printf("%d is prime \n", nums[i]);
            }
        }


        sc.close();
    }
}
