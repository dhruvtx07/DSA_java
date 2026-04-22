package practice.phase1.level1;
import java.util.Scanner;

public class greater_between_three {
    public static void main(String[] args){
        System.out.println("-------------------");
        System.out.println("Greatest between three numbers");
        System.out.println("-------------------");

        System.out.print("Enter three numbers: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int greatestNum = Math.max(num1, Math.max(num2, num3));

        System.out.printf("%d is greatest among all three numbers \n", greatestNum);

        int greaterNum = num1; // assume that this is greatest
        if(num2>greaterNum){
            greaterNum = num2;
        }
        if(num3>greaterNum){
            greaterNum = num3;
        }

        System.out.printf("%d is greater", greaterNum);
        sc.close();


    }
}
