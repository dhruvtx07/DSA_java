package practice.phase4.level1;
import java.util.Scanner;

public class sum_of_all_elements_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("sum of all elements of array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int sum = 0;

        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            sum += num[i];
        }
        System.out.println(sum);


        sc.close();
    }
}
