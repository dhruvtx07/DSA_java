package practice.phase6.level3;
import java.util.*;

public class print_all_unique_elements_from_array {
    public static void main(String[] args){
        System.out.println("print all unique elements from array");
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        ArrayList<Integer> seen = new ArrayList<>();
        for(int i : nums){
            if(!seen.contains(i)){
                seen.add(i);
            }
        }

        System.out.print(seen);

        sc.close();
    }
}
