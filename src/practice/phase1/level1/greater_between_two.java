package practice.phase1.level1;
import java.util.Scanner;

public class greater_between_two {
    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("Greatest between two numbers");
        System.out.println("-----------------");


        System.out.print("Enter two numbers: ");
        Scanner sc  = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        if(num1>num2){
            System.out.printf("%d is greater than %d\n", num1, num2);
        }else if(num1<num2){
            System.out.printf("%d is greater than %d\n", num2, num1);
        }else{
            System.out.printf("%d equal %d\n", num1, num2);
        }

        if(num1 == num2){
            System.out.printf("%d equal %d \n", num1, num2);
        }else{
            int greatestNum = (num1>num2) ? num1 : num2;
            System.out.printf("%d is greatest\n", greatestNum);
        }

        int greaterNum = (num1==num2) ? num1 : ((num1>num2) ? num1 : num2 );
        int mathMax = Math.max(num1, num2);

        System.out.printf("%d is greatest\n", greaterNum);
        System.out.printf("%d is greatest using Math max\n", mathMax);


        sc.close();





        sc.close();
    }
}
