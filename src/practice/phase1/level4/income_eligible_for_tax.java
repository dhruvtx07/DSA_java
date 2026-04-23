package practice.phase1.level4;
import java.util.Scanner;

public class income_eligible_for_tax {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("check income tax eligibility");
        System.out.println("----------------");

        System.out.print("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.print("Enter income: ");
        int income = sc.nextInt();

        if(age>=18 && income>=500000){
            System.out.println("eligible for income tax");
        }else{
            System.out.println("not eligible");
        }
        sc.close();
    }
}
