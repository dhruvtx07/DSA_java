package practice.phase2.level3;
import java.util.Scanner;

public class print_factors_of_n {
    public static void main(String[] args){

        System.out.println("----------------");
        System.out.println("factors of a number");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.printf("factors of %d are: \n", num);
        for(int i = 1; i*i<=num; i++){
            if(num % i ==0){
                System.out.printf("%d, ", i);
                System.out.printf("%d, ", num/i);
            }
        }
        System.out.printf("%d ", num);

        sc.close();
    }
}
