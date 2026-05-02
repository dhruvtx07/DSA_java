package practice.phase4.level5;
import java.util.Scanner;

public class count_frequency_of_each_element {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count frequency of each element");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);


        int[] nums = new int[5];

        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }


        System.out.println("\nArray");
        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        System.out.println();

        for(int i = 0; i<nums.length; i++){
            int frequency = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    frequency += 1;
                }
            }
            System.out.printf("%d - frequency: %d\n", nums[i], frequency);
        }


        sc.close();
    }
}
