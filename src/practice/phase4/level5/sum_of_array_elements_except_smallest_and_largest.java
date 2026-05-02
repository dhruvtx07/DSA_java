package practice.phase4.level5;
import java.util.Scanner;

public class sum_of_array_elements_except_smallest_and_largest {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("sum of array elements except smallest and largest");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int min = 0;
        int max = 0;

        for(int i = 0; i<nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            if(i == 0){
                min = nums[0];
                max = nums[0];
                continue;
            }else{
                if(nums[i] < min){
                    min = nums[i];
                }

                if(nums[i] > max){
                    max = nums[i];
                }
            }
        }

        System.out.println("\nArray\n");
        for(int num : nums){
            System.out.printf("%d, ", num);
        }

        System.out.printf("\nmin - %d and max - %d\n", min, max);

        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != min && nums[i] != max){
                sum = sum + nums[i];
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
