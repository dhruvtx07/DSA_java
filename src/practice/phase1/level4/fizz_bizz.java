package practice.phase1.level4;
import java.util.Scanner;

public class fizz_bizz {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Fizz bizz");
        System.out.println("----------------");

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%3 == 0 && num%5 == 0){
            System.out.println("Fizz Buzz");
        }else{
            if(num%3 == 0 ){
                System.out.println("Fizz");
            }else if(num%5 == 0){
                System.out.println("Buzz");
            }else{

            }
        }
        sc.close();
    }
}
