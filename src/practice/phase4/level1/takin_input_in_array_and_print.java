package practice.phase4.level1;
import java.util.Scanner;

public class takin_input_in_array_and_print {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("taking input in array and printing it");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
        }
        System.out.println();

        for(int i=0; i<num.length; i++){
            System.out.printf("element for %d position: %d\n", i, num[i]);
        }

        for(int i : num){
            System.out.printf("num[i] - %d\n", i);
        }

        sc.close();
    }
}
