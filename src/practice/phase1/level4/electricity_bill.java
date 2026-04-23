package practice.phase1.level4;
import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("electricity bill");
        System.out.println("----------------");

        System.out.print("Enter electricity units: ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int rate = 0;
        int bill = 0;

        if(units>0){
            if(units<=100){
                rate = 10;
                bill = rate * units;
            }else if(units<=200){
                rate = 20;
                bill = rate * units;
            }else if(units<=300){
                rate = 30;
                bill = rate * units;
            }else {
                rate = 40;
                bill = rate * units;
            }
            System.out.printf("bill %d = %d units x %d rate ", bill, units, rate);
        }else{
            System.out.println("invalid units");
        }
        sc.close();
    }
}
