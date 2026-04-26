package practice.phase2.level5;
import java.util.Scanner;

public class numbers_divisible_by_7_and_not_by_5 {
    public static void main(String[] args){
        System.out.println("-------------------");
        System.out.println("checking if number is divisible by 7 and not 5");
        System.out.println("-------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter last number: ");
        int last = sc.nextInt();
        int counter = 0;

        for(int i = first; i<= last; i++){
            if( (i % 7 == 0) && (i % 5 != 0) ){
                counter ++;
                System.out.printf("%d is divible by 7 and not 5 \n", i);
            }
        }
        System.out.printf("there are %d numbers between %d and %d which are divisible by 7 an not by 5", counter, first, last);

        sc.close();
    }
}
