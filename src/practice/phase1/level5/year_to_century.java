package practice.phase1.level5;
import java.util.Scanner;

public class year_to_century {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("year to century");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = sc.nextInt();

        if(year<1000 || year>9999 ){
            System.out.println("please enter a valid year");
        }else{
            int century = (int)year / 100;
            System.out.printf("%d century", century);
        }



        sc.close();

    }
}
