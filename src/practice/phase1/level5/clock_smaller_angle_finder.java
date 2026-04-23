package practice.phase1.level5;
import java.util.Scanner;

public class clock_smaller_angle_finder {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("Clock angle finder");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter time in minutes: ");
        int minutes = sc.nextInt();

        if(hours<=12 && minutes <= 59){
            int minuteAngle = 6 * minutes;
            int hourAngle = (int)(30 * hours + 0.5 * minutes);

            int angle = hourAngle - minuteAngle;

            if(angle>180) angle = 360 - angle;

            System.out.printf("angle is %d", angle);
        }else{
            System.out.println("invalid time");
        }


        sc.close();
    }
}
