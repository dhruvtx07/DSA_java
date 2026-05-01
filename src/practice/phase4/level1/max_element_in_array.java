package practice.phase4.level1;
import java.util.Scanner;

public class max_element_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("max element of array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        int max = 0;

        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            if(i == 0){
                max = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);


        sc.close();
    }
}
