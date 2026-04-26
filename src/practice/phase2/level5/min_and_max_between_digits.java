package practice.phase2.level5;
import java.util.ArrayList;
import java.util.Scanner;

public class min_and_max_between_digits {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("minimum and maximum between digits");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int min = num % 10;
        int max = num % 10;

        while(num>0){
            int digit = num % 10;
            if(digit<min){
               min = digit;
            }
            if(digit>max){
                max = digit;
            }
            num /= 10;
        }

        System.out.printf("min - %d \nmax - %d", min, max);


        sc.close();
    }
}
