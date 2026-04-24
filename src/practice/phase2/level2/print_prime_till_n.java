package practice.phase2.level2;
import java.util.Scanner;

public class print_prime_till_n {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("print prime numbers till n");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean flag = true;

        for(int i = 1; i<num/2; i++){
            if(i!=1){
                if(num%1==0){
                    flag =false;
                }
            }
        }
        if(!flag){
            System.out.println("non prime");
        }


        sc.close();

    }
}
