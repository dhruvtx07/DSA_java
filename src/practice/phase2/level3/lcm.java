package practice.phase2.level3;
import java.util.Scanner;

public class lcm {
    public static int findHcf(int num1, int num2){
        int Hcf = 0;

        while(num1!=0){
            int temp = num1;
            num1 = num2 % num1;
            num2 = temp;
        }
        System.out.printf("HCF is: %d\n", num2);
        return Hcf = num2;
    }
    public static int findLcm(int num1, int num2){
        int Lcm = 0;
        Lcm = (num1*num2 / findHcf(num1, num2) );
        return Lcm;
    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("LCM of two numbers");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int lcm = findLcm(num1, num2);

        System.out.printf("LCM of %d and %d is: %d", num1, num2, lcm);

        sc.close();
    }
}
