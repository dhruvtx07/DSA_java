package practice.phase4.level3;
import java.util.*;

public class create_new_array_with_even_elements_only {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("creating new array with even elements only");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];
        int[] nums2 = new int[5];
        ArrayList<Integer> nums3 = new ArrayList<>();


        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
            if(nums[i]%2==0){
                nums2[i] = nums[i];
                nums3.add(nums[i]);
            }
        }

        System.out.println("printing via the static array");
        for(int i : nums2){
            System.out.printf("%d, ", i);
        }

        System.out.println("\nprinting via the dynamic array");
        for(int i : nums3){
            System.out.printf("%d, ", i);
        }

        sc.close();
    }
}
