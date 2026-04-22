package practice.phase1.level1;
import java.util.*;

public class number_check {
    public static void main(String[] args){

        System.out.println("----------------");
        System.out.println("NumberCheck");
        System.out.println("----------------");

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is positive");
        }else if(num<0){
            System.out.println("number is negative");
        }else {
            System.out.println("Number is zero");
        }

        sc.close();
    }
}
