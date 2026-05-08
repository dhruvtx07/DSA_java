package practice.phase6.sorting;
import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args){
        System.out.println("selection sort");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i< arr.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i< arr.length; i++){
            int min_index = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        System.out.println("printing sorted array");
        for(int i = 0; i< arr.length; i++){
            System.out.printf("%d, ", arr[i]);
        }

        System.out.println();



        sc.close();
    }
}
