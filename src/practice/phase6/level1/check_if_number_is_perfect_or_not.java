package practice.phase6.level1;
import java.util.Scanner;

public class check_if_number_is_perfect_or_not {
    public static void main(String[] args){
        System.out.println("check if number is perfect or not - sum of factors of number excluding itself must be equal to itself for eg 6 = (1+2+3)");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();
        int temp = num;

        int sum = 0;
        for(int i =1; i*i<=temp; i++){
            if(temp%i == 0){
                sum += i;
                if(i!=1){
                    sum += num/i;
                }
            }
        }

        if(num == sum){
            System.out.printf("%d is perfect number", num);
        }else{
            System.out.print("not a perfect number");
        }

        sc.close();
    }
}
