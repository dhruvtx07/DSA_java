package practice.phase6.level1;
import java.util.Scanner;

public class print_reverse_of_number {
    public static void main(String[] args){
        System.out.println("printing reverse of a number");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        while(num>0){
            int digit = num %10;
            System.out.print(digit);
            num /=10;
        }

        sc.close();
    }
}
