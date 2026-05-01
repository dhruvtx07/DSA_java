package practice.phase4.level2;
import java.util.Scanner;

public class find_last_occurrence_of_element_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("find last occurrence of element in array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("Enter element to find last occurrence: ");
        int x = sc.nextInt();
        int index = -1;

        for(int i = 0; i<nums.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            nums[i] = sc.nextInt();
            if(nums[i] == x){
                index = i;
            }
        }

        System.out.println(index);
        sc.close();
    }
}
