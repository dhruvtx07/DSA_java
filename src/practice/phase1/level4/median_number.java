package practice.phase1.level4;
import java.util.Scanner;

public class median_number {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Median number");
        System.out.println("----------------");

        System.out.print("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 == num2 || num2 == num3 || num3 == num1){
            System.out.println("invalid numbers");
        }
        else if((num1> num2 && num1<num3 )|| (num1< num2 && num1>num3 )){
            System.out.println("number 1 is the median number");
        }
        else if((num2> num1 && num2<num3) || (num2< num1 && num2>num3)){
            System.out.println("number 2 is the median number");
        }else{
            System.out.println("number 3 is the median number");
        }
        sc.close();
    }
}
