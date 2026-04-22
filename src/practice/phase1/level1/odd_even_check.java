package practice.phase1.level1;
import java.util.Scanner;

public class odd_even_check {
    public static void main(String[] args){

        System.out.println("---------------");
        System.out.println("Odd even checker");
        System.out.println("---------------");


        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        if((num&1)==1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }

        sc.close();
    }
}
