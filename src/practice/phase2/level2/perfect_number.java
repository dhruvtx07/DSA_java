package practice.phase2.level2;
import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("perfect number checker");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<=num/2; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }

        if(sum == num){
            System.out.printf("%d is perfect number", num);
        }else{
            System.out.println("invalid number");
        }

        sc.close();
    }
}
