package practice.phase1.level4;
import java.util.Scanner;

public class twenty_four_hours_time {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Hours to AM/PM");
        System.out.println("----------------");

        System.out.print("Enter hours time in 24 hours: ");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if(time<0 || time >24){
            System.out.println("invalid hour time");
        }
        else if(time<=12){
            System.out.println("AM");
        }else{
            System.out.println("PM");
        }
        sc.close();
    }
}
