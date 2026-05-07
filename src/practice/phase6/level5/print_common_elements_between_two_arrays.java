package practice.phase6.level5;
import java.util.*;

public class print_common_elements_between_two_arrays {
    public static void main(String[] args){
        System.out.println("print common elements between arrays");
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        System.out.println("taking input for array 1");
        for(int i =0; i<arr1.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[5];
        System.out.println("\ntaking input for array 2");
        for(int i =0; i<arr2.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            arr2[i] = sc.nextInt();
        }

        for(int i =0; i<arr1.length; i++) {
            int a = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int b = arr2[j];
                if(i!=j){
                    if(a==b){
                        System.out.println(a);
                    }
                }
            }
        }

        sc.close();
    }
}
