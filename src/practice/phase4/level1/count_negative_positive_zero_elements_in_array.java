package practice.phase4.level1;
import java.util.Scanner;

public class count_negative_positive_zero_elements_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("count number of positive, negative and zero elements of array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        int positive = 0;
        int negative = 0;
        int zero = 0;


        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            if(num[i] == 0){
                zero += 1;
            }
            else if(num[i] > 0){
                positive += 1;
            }else{
                negative += 1;
            }
        }
        System.out.println();

        System.out.printf("zero - %d\n", zero);
        System.out.printf("positive - %d\n", positive);
        System.out.printf("negative - %d\n", negative);


        sc.close();
    }
}
