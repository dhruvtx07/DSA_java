package practice.phase1.level5;
import java.util.Scanner;

public class date_validator {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Date validator");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date: ");
        int date = sc.nextInt();

        System.out.print("Enter a month in number: ");
        int month = sc.nextInt();


        switch(month){
            case 1, 3, 5, 7, 8, 10, 12:{
                if(date>0 && date<=31){
                    System.out.println("valid date");
                }else{
                    System.out.println("invalid date");
                }
                break;
            }
            case 2:{
                if(date>0 && date<=28){
                    System.out.println("valid date");
                }else{
                    System.out.println("invalid date");
                }
                break;
            }
            case 4, 6, 9, 11:{
                if(date>0 && date<=30){
                    System.out.println("valid date");
                }else{
                    System.out.println("invalid date");
                }
                break;
            }
            default: {
                System.out.println("Invalid month entered");
                break;
            }
        }

        sc.close();
    }
}
