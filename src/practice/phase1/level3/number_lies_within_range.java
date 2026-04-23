package practice.phase1.level3;
import java.util.Scanner;

public class number_lies_within_range {
    public static void main(String[] args){
        System.out.println("--------------------");
        System.out.println("Check if number lies between the range");
        System.out.println("--------------------");


        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>=100 && num<=999){
            System.out.println("valid number");
        }else{
            System.out.println("invalid number");
        }

        sc.close();
    }
}
