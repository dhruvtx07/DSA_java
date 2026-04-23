package practice.phase1.level2;
import java.util.Scanner;

public class eligible_to_vote {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("vote eligibility");
        System.out.println("---------------");


        System.out.print("Enter your age to check your voter eligibility: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<=0 || age>=100){
            System.out.println("Invalid age");
        }else{
            if(age>=18){
                System.out.println("you are eligible to vote");
            }else{
                System.out.println("you are not eligible to vote");
            }
        }

        sc.close();

    }
}
