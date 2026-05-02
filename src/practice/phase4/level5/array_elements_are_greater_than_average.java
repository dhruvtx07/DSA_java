package practice.phase4.level5;
import java.util.Scanner;

public class array_elements_are_greater_than_average {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("array elements which are greater than average");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);


        int[] nums = new int[5];
        int average = 0;

        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            average = average + nums[i];
        }

        average = average / 5;

        System.out.println("\nArray");
        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        System.out.println();
        System.out.printf("average: %d\n", average);

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>average){
                System.out.printf("%d, ", nums[i]);
            }
        }


        sc.close();
    }
}
