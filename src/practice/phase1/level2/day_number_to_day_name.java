package practice.phase1.level2;
import java.util.Scanner;

public class day_number_to_day_name {

    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Day number to day name");
        System.out.println("---------------");


        System.out.print("Enter a day number: ");

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayName;

        switch(day){
            case 1:{
                dayName="Monday";
                break;
            }
            case 2:{
                dayName="Tuesday";
                break;
            }case 3:{
                dayName="Wednesday";
                break;
            }case 4:{
                dayName="Thursday";
                break;
            }case 5:{
                dayName="Friday";
                break;
            }case 6:{
                dayName="Saturday";
                break;
            }case 7:{
                dayName="Sunday";
                break;
            }
            default: {
                dayName = "Invalid";
                System.out.println("Invalid day entered");
                break;
            }
        }
        System.out.printf("day %d is %s", day, dayName);
        sc.close();
    }


}
