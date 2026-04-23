package practice.phase1.level4;
import java.util.Scanner;

public class weekday_or_weekend {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("weekday or weekend");
        System.out.println("----------------");

        System.out.print("Enter a day number 1-7: ");
        Scanner sc = new Scanner(System.in);
        int daynum = sc.nextInt();

        switch(daynum){
            case 1,2,3,4,5: System.out.println("weekday"); break;
            case 6,7: System.out.println("weekend"); break;
            default: System.out.println("invalid day");
        }
        sc.close();
    }
}
