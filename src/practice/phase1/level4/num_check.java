package practice.phase1.level4;
import java.util.Scanner;

public class num_check {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("number checker");
        System.out.println("----------------");

        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if(num1>=0 && num2>=0){
            System.out.println("both are positive");
            if(num1+num2 < 100){
                System.out.println("sum is less than 100");
            }
        }else{
            System.out.print("invalid numbers");
        }
        sc.close();
    }
}
