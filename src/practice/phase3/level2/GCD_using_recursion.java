package practice.phase3.level2;
import java.util.Scanner;

public class GCD_using_recursion {
    public static int GCD(int num1, int num2){
        if(num1<=0){
            return num2;
        }
        int ans = num2 % num1;
        return GCD(ans, num1);
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("HCF using recursion");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int HCF = GCD(num1, num2);

        System.out.println(HCF);

        sc.close();
    }
}
