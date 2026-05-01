package practice.phase4.level1;
import java.util.Scanner;

public class return_index_of_max_element_from_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("max element index of array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        int max = 0;
        int index = 0;

        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            if(i == 0){
                max = num[i];
            }
            if(num[i] > max){
                max = num[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);



        sc.close();
    }
}
