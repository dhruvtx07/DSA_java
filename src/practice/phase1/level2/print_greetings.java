package practice.phase1.level2;
import java.util.Scanner;

public class print_greetings {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("hourwise greetings");
        System.out.println("---------------");


        System.out.print("Enter time to get greetings, only enter hour from 0 to 23: ");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if(time<0 || time>23){
            System.out.println("Invalid time");
        }else{
            if(time<=5){
                System.out.println("good night");
            }else if(time<=12){
                System.out.println("good morning");
            }else if(time<=17){
                System.out.println("good afternoon");
            }else if(time<=20){
                System.out.println("good evening");
            }else{
                System.out.println("good night");
            }
        }

        sc.close();

    }
}
