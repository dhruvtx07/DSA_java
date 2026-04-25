package practice.phase2.level3;
import java.util.Scanner;

public class strong_number {
    public static void main(String[] args){
        System.out.println("--------------------");
        System.out.println("Strong number");
        System.out.println("--------------------");


        System.out.println("Strong number is a type of number, of which digits factorial sum is equal to the number itself");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tempNum = num;
        int sum = 0;

        while(tempNum>0){
            int digit = tempNum %10;
            int factorial = 1;
            for(int i = digit; i>=1; i--){
                factorial = factorial * i;
            }
            sum = sum + factorial;
            tempNum /= 10;
        }

        if(num == sum){
            System.out.printf("valid strong number as %d = %d", num, sum);
        }else{
           System.out.println("invalid");
        }

        sc.close();
    }
}
