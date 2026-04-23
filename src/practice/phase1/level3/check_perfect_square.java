package practice.phase1.level3;
import java.util.Scanner;

public class check_perfect_square {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Pefect square checker");
        System.out.println("---------------");


        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("non optimised brute force");
        for(int i = 0; i<=(int)(num/2); i++){
            System.out.printf("i = %d\n", i);
            if(i*i == num){
                System.out.printf("%d is perfect square of %d\n", i, num);
            }
        }
        System.out.println("optmised");
        for(int i = 0; i*i <=num; i++){
            System.out.printf("i = %d\n", i);
            if(i*i == num){
                System.out.printf("%d is perfect square of %d\n", i, num);
            }
        }

        sc.close();
    }
}
