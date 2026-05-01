package practice.phase4.level4;
import java.util.Scanner;

public class merge_two_arrays {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("merge two arrays");
        System.out.println("----------------");

        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];
        int[] nums2 = new int[5];

        int[] merged = new int[10];


        System.out.println("for array 1");
        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums[i] = sc.nextInt();
        }

        System.out.println("\nfor array 2");
        for(int i =0; i<nums.length; i++) {
            System.out.printf("Enter value for %d position: ", i+1);
            nums2[i] = sc.nextInt();
        }

        System.out.println("array 1");
        for(int i : nums){
            System.out.printf("%d, ", i);
        }

        System.out.println("\narray 2");
        for(int i : nums2){
            System.out.printf("%d, ", i);
        }

        System.out.println("\nmerging arrays...");

        for(int i = 0; i<merged.length; i++) {
            if(i <= 4){
                merged[i] = nums[i];
            }else{
                merged[i] = nums2[i-5];
            }

        }

        System.out.println("\nprinting merged arrays...");

        for(int i : merged){
            System.out.printf("%d, ", i);
        }
        sc.close();
    }
}
