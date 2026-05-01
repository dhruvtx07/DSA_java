package practice.phase4.level1;
import java.util.Scanner;

public class min_element_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("min element of array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        int min = 0;

        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            if(i == 0){
                min = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println(min);


        sc.close();
    }
}
