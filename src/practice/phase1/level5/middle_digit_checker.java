package practice.phase1.level5;
import java.util.Scanner;

public class middle_digit_checker {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("middle digit checker");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        int tempNum = num;

        int place1 = tempNum % 10;
        int place2 = (tempNum/10) % 10;
        int place3 = tempNum/100;

        if(place2 == place1+place3){
            System.out.println("valid number");
        }else{
            System.out.println("invalid number");
        }

        sc.close();
    }
}
