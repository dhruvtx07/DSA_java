package practice.phase4.level1;
import java.util.Scanner;

public class print_elements_greater_than_k {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("printing elements greater than from array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] num = new int[5];

        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            if(num[i] > k){
                System.out.printf("%d is greater than k\n", num[i]);
            }
        }



        sc.close();
    }
}
