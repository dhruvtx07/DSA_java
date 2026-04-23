package practice.phase1.level3;
import java.util.Scanner;

public class third_angle_from_other_two {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("Third angle calculator");
        System.out.println("------------------");


        System.out.print("Enter two angles of triangle: ");

        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int twoAngleSum = angle1 + angle2;

        if(twoAngleSum>=180){
            System.out.println("Invalid angles");
        }
        else{
            int angle3 = 180 - twoAngleSum;
            System.out.printf("angle 3 is %d", angle3);
        }


        sc.close();

    }
}
