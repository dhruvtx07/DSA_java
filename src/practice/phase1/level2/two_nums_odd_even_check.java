package practice.phase1.level2;
import java.util.Scanner;

public class two_nums_odd_even_check {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Two numbers odd even check");
        System.out.println("---------------");


        System.out.print("Enter two numbers: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if((num1%2==0)&&(num2%2==0)){
            System.out.println("Both are even");
        }else if((num1%2!=0)&&(num2%2!=0)){
            System.out.println("Both are odd");
        }
        else{
            if((num1%2==0)&&(num2%2!=0)){
                System.out.printf("%d is even and %d is odd", num1, num2);
            }else{
                System.out.printf("%d is odd and %d is even", num1, num2);
            }
        }

        sc.close();
    }
}
