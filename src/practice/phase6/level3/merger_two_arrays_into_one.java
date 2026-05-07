package practice.phase6.level3;
import java.util.*;

public class merger_two_arrays_into_one {
    public static void main(String[] args){
        System.out.println("merge two array into one");
        Scanner sc = new Scanner(System.in);

        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        int[] numsMerged = new int[10];

        System.out.print("array 1 input\n");
        for(int i = 0; i< nums1.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums1[i] = sc.nextInt();
        }

        System.out.print("array 2 input\n");
        for(int i = 0; i< nums2.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            nums2[i] = sc.nextInt();
        }

        System.out.print("merging arrays\n");
        for(int i = 0; i< numsMerged.length; i++){
            if(i<=4){
                numsMerged[i] = nums1[i];
            }else{
                numsMerged[i] = nums2[i-5];
            }
            System.out.printf("%d, ", numsMerged[i]);
        }



        sc.close();
    }
}
