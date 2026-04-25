package practice.phase2.level3;
import java.util.Scanner;

public class squares_one_to_n {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("printing squares from 1 to n");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last number: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            System.out.printf("square of %d is: %d\n", i, i*i);
        }

        sc.close();
    }
}
