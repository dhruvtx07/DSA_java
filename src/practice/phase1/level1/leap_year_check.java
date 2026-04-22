package practice.phase1.level1;
import java.util.Scanner;

public class leap_year_check {
    public static void main(String[] args){
        System.out.println("-------------------");
        System.out.println("Leap year check");
        System.out.println("-------------------");

        System.out.print("Enter a year: ");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
            System.out.printf("%d is a leap year", year);
        }else{
            System.out.printf("%d is not a leap year", year);
        }

        sc.close();


    }
}
