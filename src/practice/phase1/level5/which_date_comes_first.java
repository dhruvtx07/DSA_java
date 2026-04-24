package practice.phase1.level5;
import java.util.Scanner;

public class which_date_comes_first {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("which date comes first");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Date 1");

        System.out.print("Enter a date: ");
        int date1 = sc.nextInt();

        System.out.print("Enter a month in number: ");
        int month1 = sc.nextInt();



        System.out.println("Date 2");

        System.out.print("Enter a date: ");
        int date2 = sc.nextInt();

        System.out.print("Enter a month in number: ");
        int month2 = sc.nextInt();
        boolean flag = true;

        if(date1<0 || date1>32 ||date2<0 || date2>32 || month1<0 || month1>13 || month2<0 || month2>13  ){
            flag = false;
        }

        if(!flag){
            System.out.println("invalid date entered");
        }else{
            if(month1 == month2){
                if(date1<date2){
                    System.out.println("date 1 comes first");
                }else if(date1>date2){
                    System.out.println("date 2 comes first");
                }else{
                    System.out.println("both dates are same");
                }
            }else{
                if(month1<month2){
                    if(date1<date2){
                        System.out.println("month 1 date 1 comes first");
                    }else if(date1>date2){
                        System.out.println("month 1 date 2 comes first");
                    }else{
                        System.out.println("month 1");
                    }
                }if(month1>month2){
                    if(date1<date2){
                        System.out.println("month 2 date 1 comes first");
                    }else if(date1>date2){
                        System.out.println("month 2 date 2 comes first");
                    }else{
                        System.out.println("month 2");
                    }
                }
            }
        }



        sc.close();
    }
}
