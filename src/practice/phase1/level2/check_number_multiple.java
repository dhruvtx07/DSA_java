package practice.phase1.level2;
import java.util.Scanner;

public class check_number_multiple {
    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("check if one number is a multiple of another");
        System.out.println("-----------------");


        System.out.print("Enter two numbers: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if((num1 % num2 == 0)){
            System.out.printf("%d is multiple of %d", num1, num2);
        }else if((num2 % num1 == 0)){
            System.out.printf("%d is multiple of %d", num2, num1);
        }else{
            System.out.println("no multiples");
        }
        sc.close();
    }
}
