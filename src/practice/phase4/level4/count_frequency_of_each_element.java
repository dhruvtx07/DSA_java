package practice.phase4.level4;
import java.util.Scanner;

public class count_frequency_of_each_element {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count frequency of each element");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("for array 1");
        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("array 1");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i<nums.length; i++) {
            int counter = 1;
            for(int j = 0; j<nums.length; j++) {
                if(i == j){
                    break;
                }
                if(nums[i] == nums[j]){
                    counter += 1;
                }
            }
            System.out.printf("%d - %d times\n", nums[i], counter);
        }

        sc.close();
    }
}
