package practice.phase4.level1;
import java.util.Scanner;

public class return_index_of_min_element_from_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("min element index of array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        int min = 0;
        int index = 0;

        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            if(i == 0){
                min = num[i];
            }
            if(num[i] < min){
                min = num[i];
                index = i;
            }
        }
        System.out.println(min);
        System.out.println(index);



        sc.close();
    }
}
