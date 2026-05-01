package practice.phase4.level2;
import java.util.Scanner;

public class find_first_occurrence_of_element_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("find first occurrence of element in array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("Enter element to find first occurrence: ");
        int x = sc.nextInt();
        int index = 0;

        for(int i = 0; i<nums.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }


        for(int i =nums.length-1; i>=0; i--){
            if(nums[i] == x){
                index = i;
            }
        }

        System.out.println(index);
        sc.close();
    }
}
