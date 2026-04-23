package practice.phase1.level2;
import java.util.Scanner;

public class month_has_days {

    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Month number to number of days");
        System.out.println("---------------");


        System.out.print("Enter a month number: ");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int days = 0;

        switch(month){
            case 1, 3, 5, 7, 8, 10, 12:{
                days=31;
                break;
            }
            case 2:{
                days=28;
                break;
            }
            case 4, 6, 9, 11:{
                days=30;
                break;
            }
            default: {
                days = 0;
                System.out.println("Invalid month entered");
                break;
            }
        }
        System.out.printf("%d month has %d days", month, days);
        sc.close();
    }


}
