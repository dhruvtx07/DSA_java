package practice.phase6.sorting;
import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args){
        System.out.println("bubble sort");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i =0; i< arr.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            arr[i] = sc.nextInt();;
        }

        for(int i =0; i< arr.length; i++){
            boolean swapped = false;
            for(int j =0; j< arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println("runs");
        }

        System.out.println("\nprinting sorted array");
        for(int i =0; i< arr.length; i++){
            System.out.printf("%d, ", arr[i]);
        }


        sc.close();
    }
}
