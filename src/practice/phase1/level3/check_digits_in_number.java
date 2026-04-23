package practice.phase1.level3;
import java.util.Scanner;

public class check_digits_in_number {

    public static void main(String[] args){

        System.out.println("--------------");
        System.out.println("check how many digits number is having");
        System.out.println("--------------");


        System.out.print("enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int tempNum = num;
        int digitCounter =0;

        // 10
        if(tempNum>0){
            while(tempNum>0){
                digitCounter++;
                tempNum /= 10;
            }
        }

        System.out.printf("%d has %d digits", num, digitCounter);
        sc.close();
    }



}
