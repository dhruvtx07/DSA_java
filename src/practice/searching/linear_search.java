package practice.searching;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args){
        System.out.println("linear search");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i< nums.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.print("\nenter number to search for: ");
        int target = sc.nextInt();

        int idx = -1;
        for(int i = 0; i< nums.length; i++){
            int num = nums[i];
            if(num == target){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("element not found");
        }else{
            System.out.printf("%d found at %d index", nums[idx], idx);
        }



        sc.close();
    }
}
