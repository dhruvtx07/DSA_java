package practice.phase4.level1;
import java.util.Scanner;

public class count_even_and_odd_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("count number of even and odd elements of array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        int even = 0;
        int odd = 0;


        for(int i=0; i<num.length; i++){
            System.out.printf("Enter element for %d position: ", i+1);
            num[i] = sc.nextInt();
            if(num[i]%2 == 0){
                System.out.printf("even - %d\n", num[i]);
                even += 1;
            }
            else{
                System.out.printf("odd - %d\n", num[i]);
                odd += 1;
            }
        }
        System.out.println();

        System.out.printf("count of even - %d\n", even);
        System.out.printf("count of odd - %d\n", odd);


        sc.close();
    }
}
